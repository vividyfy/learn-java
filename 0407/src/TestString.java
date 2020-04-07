public class TestString {
    public static int  compareTo(String str1,String str2) {
        return str1.compareTo(str2);
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "Abc";
        System.out.println(compareTo(str1,str2));
    }
}
