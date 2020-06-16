public class ThreadDemo2 {
    //使用懒汉模式来实现，Singleton类被加载的时候，不会立刻实例化
    static class Singleton {
        private Singleton() {}
        public volatile static Singleton instance = null;
        public static Singleton getInstance() {
            if (instance == null) {
                synchronized (Singleton.class) {
                    if (instance == null) {
                        instance = new Singleton();
                    }
                }
            }
            return instance;
        }
    }
}
