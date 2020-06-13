import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> stringSet = new HashSet<>();
        while (sc.hasNext()) {
            String s = sc.next();
            String[] str = s.split(" ");
            stringSet.addAll(Arrays.asList(str));

        }
        System.out.println(stringSet.size());
    }
}
