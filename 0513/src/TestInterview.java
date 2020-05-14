import java.util.HashMap;
import java.util.Map;

public class TestInterview {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            Integer count = map.get(x);
            if (count == null) {
                map.put(x, 1);
            } else {
                map.put(x, count + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1)) {
                return entry.getKey();
            }
        }
        return 0;
    }


    //方法二
    public int singleNumber2(int[] nums) {
        int ret = 0;
        for (int x : nums) {
            ret ^= x;
        }
        return ret;
    }

}
