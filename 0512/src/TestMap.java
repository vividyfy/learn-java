import java.util.HashMap;
import java.util.Map;
public class TestMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "hello");
        // key重复
        map.put(1, "Hello");
        map.put(3, "Java");
        map.put(2, "Bit");
        System.out.println(map);
        // 根据key取得value
        System.out.println(map.get(2));
        // 查找不到返回null
        System.out.println(map.get(99));
        // 打印所有的 key
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }
        //打印所有的 value
        for (String value : map.values()) {
                System.out.println(value);
        }
        //按 key -value 映射关系打印
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

}
