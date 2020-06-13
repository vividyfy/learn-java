public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000000; i++) {

                }
            }
        };
        System.out.println(t.getState());
        t.start();
        while (t.isAlive()) {
            System.out.println("2" + t.getState());
        }
        System.out.println(t.getState());
    }
}
