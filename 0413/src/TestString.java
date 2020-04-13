import java.lang.reflect.Field;

public class TestString {
//   public static void main1(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        String str = "hello";
//        //根据value找到str中内部存储的value数组
//        Field field = String.class.getDeclaredField("value");
//        //将访问属性设为true
//        field.setAccessible(true);
//        //获取到str中的value属性
//        char[] value = (char[])field.get(str);
//        //修改value值
//        value[0] = 'H';
//        System.out.println(str);
//public static void main(String[] args) {
//    String str = "hello";
//    System.out.println(str.charAt(3));//l
//}
public static void main(String[] args) {
    String str = "Howareyou";
    //字符串转换为字符数组
    //方法一，涉及字符串的拷贝，当字符串过长，速度就会降低
    char[] array = str.toCharArray();
    for (int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
    }
    //方法二，不涉及字符串拷贝，更推荐
    for (int i = 0; i < str.length(); i++) {
        System.out.println(str.charAt(i));
    }
    //字符数组转换为字符串
    //System.out.println(new String(array));//全部转换
    //System.out.println(new String(array,3,6));//部分转换
}
//public static void main3(String[] args) {
//    String str = "Howareyou";
//    //String转byte
//    byte[] array = str.getBytes();
//    for (int i = 0; i < array.length; i++) {
//        System.out.println(array[i]);
//    }
//    //byte转String
//    System.out.println(new String(array));
//}
//        str1 = "hey";
//        System.out.println(str1);//hey
//        String str2 = new String("hello").intern();
//        System.out.println(str1==str2);//true
//        String str3 = "hello";
//        String str4 = "hello";
//
//        System.out.println(str2==str3);//true
//        System.out.println(str3==str4);//true
//        System.out.println("hello".equals(str1));
//
//        //方法一
//        String str1 = "hello";
//        //方法二
//        String str2 = new String("hello");
//        //方法三
//        char[] array = {'h','e','l','l','o'};
//        String str3 = new String(array);
//        System.out.println(str1==str2);
//        System.out.println(str1.equals(str2));
//
//}
