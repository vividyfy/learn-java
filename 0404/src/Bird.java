public class Bird extends Animals{
    //    public String name;
    //    //
    public void fly() {
        System.out.println(this.name+"正在飞！");
    }
    public int age;
    public Bird (String name,int age) {
        super(name);
        this.age = age;
    }
    public void testProtected(String name) {
        System.out.println(this.sex);
    }
}
