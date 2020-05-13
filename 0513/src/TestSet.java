import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        //1、插入元素 add多个相同元素，最终在set中只有一份（去重）
        set.add("java");
        set.add("php");
        set.add("c++");
        set.add("python");

        //2、判定某个元素是否存在
        System.out.println(set.contains("php"));//true

        //3、删除元素
        set.remove("c++");
        System.out.println(set.contains("c++"));//false

        //4、打印set
        System.out.println(set);

        //遍历
        for (String s : set) {
            System.out.println(s);
        }

        //使用迭代器
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
