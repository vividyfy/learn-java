import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BrokenKeyboard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String expect = scanner.next();
            String actual = scanner.next();
            expect = expect.toUpperCase();
            actual = actual.toUpperCase();
            Set<Character> setActual = new HashSet<>();
            for (int i = 0; i < actual.length(); i++) {
                setActual.add(actual.charAt(i));
            }
            Set<Character> brokenKey = new HashSet<>();
            for (int i = 0; i < expect.length(); i++) {
                char c = expect.charAt(i);
                if (setActual.contains(c)) {
                    continue;
                }
                if (brokenKey.contains(c)) {
                    continue;
                }
                brokenKey.add(c);
                System.out.print(c);
            }
            System.out.println();
        }

    }
}
