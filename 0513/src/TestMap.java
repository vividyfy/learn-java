import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Student {
    public String name;
    public int age;
    public String grade;
    public String school;

    public Student(String name, int age, String grade, String school) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}

public class TestMap {
    public static void main(String[] args) {
        Student student1 = new Student("a",20,"大一","au");
        Student student2 = new Student("b",22,"大二","bu");
        Student student3 = new Student("c",24,"大四","cu");
        Student student4 = new Student("d",20,"大三","du");
        Map<Integer,Student> studentMap = new HashMap<>();
        studentMap.put(student1.age,student1);
        studentMap.put(student2.age,student2);
        studentMap.put(student3.age,student3);
        studentMap.put(student4.age,student4);
        System.out.println(studentMap.get(20));

        //遍历一个Map    entry 键值对
        for (Map.Entry<Integer,Student> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        //迭代器
        Iterator<Map.Entry<Integer, Student>> iterator = studentMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer,Student> entry = iterator.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
