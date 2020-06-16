import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            //String str = (String) GetSequeOddNum(n);
            List<Integer> list = new ArrayList<>();
            list = GetSequeOddNum(n);
            for (int i = 0; i < list.size(); i++) {
                if (i < list.size()-1) {
                    System.out.print(list.get(i) + "+");
                } else {
                    System.out.print(list.get(i));
                }
            }
        }
    }

    public static List<Integer> GetSequeOddNum(int n) {
        int m = n * (n-1) + 1;
//        StringBuffer sb = new StringBuffer();
//        sb.append(m);
//        for (int i = 1; i < n; i++) {
//            sb.append("+");
//            m = m + 2;
//            sb.append(m);
//
//        }
//        return sb.toString();


        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(m);
            m = m + 2;
        }
        return list;
    }
}
