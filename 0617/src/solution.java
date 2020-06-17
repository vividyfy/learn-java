import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n > 1000) {
                n = 999;
            }
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(i);
            }
            int count = 0;
            while (list.size() > 1) {
                count = (count + 2) % list.size();
                list.remove(count);
            }
            System.out.println(list.get(0));
        }
    }
}
