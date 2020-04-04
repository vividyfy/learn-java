public class TestDemo {
    public static void main(String[] args) {
        Animals animals = new Animals("二三");
        System.out.println(animals.sex);
    }
    public static void main2(String[] args) {
        Bird bird = new Bird("初一",10);
//        bird.name = "初一";
        bird.eat();
        bird.fly();
    }
    public static void main1(String[] args) {
        Dog dog = new Dog("将军");
        dog.name = "将军";
        dog.eat();
    }
}
