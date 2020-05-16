import java.util.*;

public class solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String x : words) {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        List<String> result = new ArrayList<>(map.keySet());
        Collections.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int count1 = map.get(01);
                int count2 = map.get(02);
                if (count1==count2){
                    return o1.compareTo(o2);
                }
                return count2 - count1;
            }
        });
        return result.subList(0,k);
    }
}
