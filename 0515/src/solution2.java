import java.util.HashSet;
import java.util.Set;

public class solution2 {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for (int i = 0; i < J.length(); i++) {
            char t = J.charAt(i);
            if (S.contains(t+"")) {
                count++;
            }
        }
        return count;
    }

    //set方法
    public int numJewelsInStones2(String J, String S) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (set.contains(c)) {
                count++;
            }
        }
        return count;
    }
}
