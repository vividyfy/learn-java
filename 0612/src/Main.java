import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n.length(); i++) {
            list.add(Integer.parseInt(String.valueOf(n.charAt(i))));
        }
        Collections.sort(list);
        int[] array = new int[10];
        for (int i = 0; i < list.size(); i++) {
            array[list.get(i)]++;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.println(i+":"+array[i]);
            }
        }

    }
}
