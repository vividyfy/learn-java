import java.util.Scanner;
import java.util.concurrent.locks.Lock;

public class ThreadDemo4 {
    public static void main(String[] args) {
        Object locker1 = new Object();
        Object locker2 = new Object();

        Thread t1 = new Thread() {
            @Override
            public void run() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("请输入一个整数： ");
                synchronized (locker1) {
                    int n = scanner.nextInt();
                    System.out.println("n " + n);
                }
            }
        };
        t1.start();

        Thread t2 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (locker2) {
                        System.out.println("线程二获取到锁了");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        t2.start();
    }
}
