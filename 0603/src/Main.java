import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int maxSize = 0;
        int count = 0;
        for (int i = 0; i + 1 < s.length(); i++) {
            if (s.charAt(i) >= 0 && s.charAt(i) <= 9) {
                int j = i+1;
               if (s.charAt(j) >= 0 && s.charAt(j) <= 9) {
                   int tmp = j;
                   count++;
               }

            }
        }
        System.out.println(count);
    }
}






//        Node head = new Node(s.charAt(0));
//        for (int i = 1; i < s.length(); i++) {
//            while (head.next !=null ) {
//                head.next = new Node(s.charAt(i));
//                head = head.next;
//            }
//        }
//        Node cur = head;
//        while (cur.val = '1'||'2'||'3'||'4'||'5'||'6'||'7'||'8'||'9'||'0')
//    }

