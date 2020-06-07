public class ThreadDemo2 {
    private static long count = 100_0000_0000L;

    public static void main(String[] args) throws InterruptedException {
        serial();
        concurrency();
    }

    //串行
    private static void serial() {
        long start = System.currentTimeMillis();

        int a = 0;
        for (long i = 0; i < count; i++) {
            a++;
        }
        int b = 0;
        for (long i = 0; i < count; i++) {
            b++;
        }
        long end = System.currentTimeMillis();
        System.out.println("time = "+ (end - start) + " ms");
    }

    //并行
    private static void concurrency() throws InterruptedException {
        long start = System.currentTimeMillis();

        Thread t1 = new Thread() {
            @Override
            public void run() {
                int a = 0;
                for (long i = 0; i < count; i++) {
                    a++;
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                int b = 0;
                for (long i = 0; i < count; i++) {
                    b++;
                }
            }
        };

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        long end = System.currentTimeMillis();
        System.out.println("time = "+ (end - start) + " ms");
    }
}
