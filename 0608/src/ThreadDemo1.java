public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t = new Thread("cxk 线程"){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t.start();
        //名称
        System.out.println(t.getName());
        //优先级
        System.out.println(t.getPriority());
        //ID
        System.out.println(t.getId());
        //状态
        System.out.println(t.getState());
        //是否存活
        System.out.println(t.isAlive());
        //是否后台线程
        System.out.println(t.isDaemon());
        //是否被中断
        System.out.println(t.isInterrupted());

    }
}
