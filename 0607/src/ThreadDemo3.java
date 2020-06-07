

public class ThreadDemo3 {
    static class MyRunnable implements Runnable  {

        @Override
        public void run() {
            System.out.println("我是一个新线程");
        }
    }
    public static void main(String[] args) {

        //显示创建一个类实现Runnable 将Runnable实例和Thread关联
        Thread t1 = new Thread(new MyRunnable());
        t1.start();

        //通过匿名内部类实现Runnable接口
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("我是一个新线程");

            }
        };
        Thread t2 = new Thread(runnable);
        t2.start();

        //使用lambda表达式来执行线程执行的内容
        Thread t3 = new Thread(() -> {
            System.out.println("我是一个新线程");
        });
        t3.start();
    }
}
