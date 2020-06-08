public class ThreadDemo3 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread() {
            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println("正在转账");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }
                }
                System.out.println("中止转账");
            }
        };
        t.start();
        Thread.sleep(5000);
        System.out.println("有内鬼，终止交易");
        t.interrupt();
    }
}
