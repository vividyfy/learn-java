import java.util.Arrays;
class MyValue {
    public int val;
}
public class TestDemo2 {
    public static void swap2(MyValue myValue1,MyValue myValue2) {
        int tmp = myValue1.val;
        myValue1.val = myValue2.val;
        myValue2.val = tmp;
    }
    public static void main(String[] args) {
        MyValue myValue1 = new MyValue();
        MyValue myValue2 = new MyValue();
        myValue1.val = 10;
        myValue2.val = 20;
        swap2(myValue1,myValue2);
        System.out.println(myValue1.val+ " " +myValue2.val);
    }
    public static void swap(int[] array) {
        int tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;
    }
    public static void main1(String[] args) {
        int[] array = {10,20};
        swap(array);
        System.out.println(Arrays.toString(array));
    }
}
