public class Animals {
    public String name;
    protected String sex;
    public Animals(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(this.name+"正在吃！");
    }
}
