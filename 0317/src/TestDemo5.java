public class TestDemo5 {
    public static String toString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
                str += array[i];
                if (i < array.length - 1)
                    str += ",";
        }
        str += "]";
        return str;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        String str2 = toString(array);
        System.out.println(str2);
    }
}
