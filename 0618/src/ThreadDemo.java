
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ThreadDemo {
    //使用worker描述工作线程
    static class Worker extends Thread {
        private int id = 0;
        private BlockingQueue<Runnable> queue = null;

        public Worker(BlockingQueue<Runnable> queue, int id) {
            this.queue = queue;
            this.id = id;
        }

        @Override
        public void run() {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    Runnable command = queue.take();
                    System.out.println("thread " + id + " running");
                    command.run();
                }
            } catch (InterruptedException e) {
                System.out.println("线程被终止");
            }
        }
    }

    //本质上是一个生产者消费者模型
    //调用execute代码的就是生产者，生产了任务 Runnable对象
    //worker线程就是消费者，消费了队列中的任务
    //交易场所就是blockingqueue
    static class MyThreadPool {
        //这个阻塞队列用于组织若干个任务
        private BlockingQueue<Runnable> queue = new LinkedBlockingDeque<>();

        //list用来组织若干个工作线程
        private List<Worker> workers = new ArrayList<>();

        //一个线程池中该有的线程数量
        private static final int maxWorkerCount = 10;

        //实现execute方法和shutdown方法
        public void execute(Runnable command) throws InterruptedException {
            //使用延时加载的方式来创建线程
            //线程池中数目较少的时候，新创建线程作为工作线程
            //如果线程数目已经达到设置的阈值，就不用创建新线程了
            if (queue.size() < maxWorkerCount) {
                Worker worker = new Worker(queue, workers.size());
                worker.start();
                workers.add(worker);
            }

            queue.put(command);
        }

        public void shutDown() throws InterruptedException {
            for (Worker worker: workers) {
                worker.interrupt();
            }

            //等待每个线程执行结束
            for (Worker worker : workers) {
                worker.join();
            }
        }
    }

    static class Command implements Runnable {
        private int num;
        public Command(int num) {
            this.num = num;
        }

        @Override
        public void run() {
            System.out.println("正在执行任务:" + num);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThreadPool myThreadPool = new MyThreadPool();
        for (int i = 0; i < 1000; i++) {
            myThreadPool.execute(new Command(i));
        }
        Thread.sleep(2000);
        myThreadPool.shutDown();
        System.out.println("线程池已被销毁");
    }
}
