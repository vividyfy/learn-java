import java.math.BigInteger;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1  = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println(AddLongInteger(s1, s2));

    }
    public static String AddLongInteger(String addend, String augend) {
        BigInteger bigInteger = new BigInteger(addend);
        BigInteger bigInteger2 = new BigInteger(augend);
        BigInteger bigInteger3 =  bigInteger.add(bigInteger2);
        String str = String.valueOf(bigInteger3);
        return str;
    }
}
