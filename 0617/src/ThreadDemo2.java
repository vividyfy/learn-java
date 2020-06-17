import java.util.concurrent.PriorityBlockingQueue;

public class ThreadDemo2 {
    static class Task implements Comparable<Task> {
        // 借助Runnable中的run方法来描述具体要执行的任务
        private Runnable command;
        //time表示执行command的时间 是一个绝对时间，ms级别的时间戳
        private long time;

        //构造方法的参数after表示多少毫秒之后执行
        public Task(Runnable command, long after) {
            this.command = command;
            this.time = System.currentTimeMillis() + after;
        }

        public void run() {
            command.run();
        }

        @Override
        public int compareTo(Task o) {
            //时间小的先执行
            return (int) (this.time - o.time);
        }
    }

    static class Worker extends Thread {
        private Object mailBox = null;
        private PriorityBlockingQueue<Task> queue = null;

        public Worker(PriorityBlockingQueue<Task> queue, Object mailBox) {
            this.queue = queue;
            this.mailBox = mailBox;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Task task = queue.take();
                    long curTime = System.currentTimeMillis();
                    if (task.time > curTime) {
                        queue.put(task);
                        synchronized (this) {
                            mailBox.wait(task.time - curTime);
                        }
                    } else {
                        task.run();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
        }
    }

    static class Timer {
        //为了避免忙等，需要使用wait方法
        //使用一个单独的对象来辅助wait
        private Object mailBox = new Object();


        //1、有一个类来描述任务
        //2、阻塞优先队列组织若干个任务，队首元素就是时间最早的元素
        private PriorityBlockingQueue<Task> queue = new PriorityBlockingQueue<>();
        public Timer() {
            Worker worker = new Worker(queue,mailBox);
            worker.start();
        }

        public void schedule(Runnable command, long after) {
            Task task = new Task(command, after);
            queue.put(task);
            synchronized (this) {
                mailBox.notify();
            }
        }
    }

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("hehe");
                timer.schedule(this,2000);
            }
        },2000);
    }
}
