public class ThreadDemo3 {
    static class Test {
        private Object o = new Object();
        public void method () {
            synchronized (o) {
                System.out.println("hhh");
            }
        }
    }
    public static void main(String[] args) {
        Test t = new Test();
    }
}
