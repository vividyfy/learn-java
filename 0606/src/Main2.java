import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            list.add(n);
        }
        Collections.sort(list);
        System.out.println(list.get(list.size()/2 - 1));
    }
}
