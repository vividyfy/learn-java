class Person {
    //成员属性
    public int age;
    public String name;
    //成员方法
    public void eat() {
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        //通过new实例化对象
        Person person = new Person();
        person.name = "abc";
        person.age = 18;
        person.eat();
        person.sleep();
        System.out.println(person.age);
        System.out.println(person.name);
    }
}
