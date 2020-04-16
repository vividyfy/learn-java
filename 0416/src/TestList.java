import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        //1.实例化一个list
        List<String> list = new ArrayList<>();

        //2.新增元素
        list.add("hello");
        list.add("java");
        list.add("world");
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        //3.打印list
        System.out.println(list);

        //4.使用下标访问
        //当前list是arraylist ,get/set下表取值时间复杂度为O(1);
        //如果是LinkedList,get/set下表取值时间复杂度为O(N);
        System.out.println(list.get(2));
        list.set(0,"Hello");
        System.out.println(list);

        //5.截取部分内容
        System.out.println(list.subList(0, 2));

        //6.重新构造一个list(浅拷贝)
        List<String> arrayList = new ArrayList<>(list);
        List<String> linkedList = new LinkedList<>(list);
        System.out.println(arrayList);
        System.out.println(linkedList);

        //7.基于list的强制转换()
        LinkedList<String> linkedList1 = (LinkedList<String>) list;
        ArrayList<String> arrayList1 = (ArrayList<String>) list;
    }
}
