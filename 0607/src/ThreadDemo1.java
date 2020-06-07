public class ThreadDemo1 {
    static class MyThread extends Thread {
        @Override
        public void run() {
            super.run();
            System.out.println("Hello world, 我是一个线程");
            while (true) {

            }
        }
    }

    public static void main(String[] args) {
        //使用Thread类来创建一个Thread实例
        //当Thread对象被创建出来后，内核中并没有随之产生一个线程（PCB）
        Thread t = new MyThread();
        //执行start方法，才真的创建出了一个线程
        t.start();
        while (true) {

        }
    }
}
