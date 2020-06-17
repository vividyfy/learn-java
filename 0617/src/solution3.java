import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] ch = str.toCharArray();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(0);
        }
        for (int i = 0; i < ch.length; i++) {
            list.set(ch[i] - '0',list.get(ch[i] - '0')+1);
        }
        System.out.println(list.get(0 - '0') + 1);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != 0) {
                //System.out.println(i + ":" + list.get(i));
            }
        }
    }
}
