public class ThreadDemo1 {
    //饿汉模式单例实现 只要类被加载，实力就会立刻创建
    static class Singleton {
        //将构造方法变为私有，类外部无法创建该类的实例
        private Singleton() { }
        static Singleton instance = new Singleton();
        public static Singleton getInstance() {
            return instance;
        }


    }
    public static void main(String[] args) {
        Singleton singleton = new Singleton();
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1==s2);
    }
}
