import java.util.Arrays;

public class TestString {
    public static void main(String[] args) {
        //StringBuffer和StringBuilder
        //字符串反转
        StringBuffer str1 = new StringBuffer("helloworld");
        System.out.println(str1.reverse());//dlrowolleh
        //删除指定范围
        StringBuffer str2 = new StringBuffer("howareyou");
        System.out.println(str2.delete(5,6));//howaryou
        //插入数据
        StringBuffer str3 = new StringBuffer("howareyou");
        System.out.println(str3.insert(3,"old"));//howoldareyou

//        //字符串截取substring方法
//        String str1 = "helloworld";
//        System.out.println(str1.substring(9));//d
//        System.out.println(str1.substring(5,7));//wo 前闭后开区间
//        String str = " \n\t hello \n\t ";
//        System.out.println(str);//     hello
//        System.out.println(str.trim());//hello

        //System.out.println(str1.toLowerCase());//hello

        //System.out.println(str2.toUpperCase());//WORLD
//        String str1 = "HELLO";
//        String str2 = "";
//        System.out.println(str1.isEmpty());//false
//        System.out.println(str2.isEmpty());//true
        //String str2 = "world";
        //System.out.println(str1.length());//5

//        String str1 = "How are you";
//        //按照空格拆分
//        String[] array = str1.split(" ");
//        System.out.println(Arrays.toString(array));//[How, are, you]
//        String str2 = "192.168.1.1";
//        //正则表达式中 . 具有特定含义，需要通过\.查找文本
//        //Java中\\表示一个文本\
//        String[] array2 = str2.split("\\.");
//        System.out.println(Arrays.toString(array2));//[192, 168, 1, 1]
//        //多次拆分
//        String str3 = "name=Bo&&age=10";
//        String[] array3 = str3.split("&&");
//        for (String tmp:array3) {
//            String[] array4 = tmp.split("=");
//            System.out.println(array4[0] + " : " + array4[1]);
//            //name : Bo  age : 10
//        }
//       String str1 = "hello world";
//       String str2 = str1.replaceAll("hello","java");
//       System.out.println(str2);//java world
//        String str3 = str1.replaceFirst("ll","LL");
//        System.out.println(str3);//heLLo world
//        System.out.println(str1);//hello world
       //String str3 = "Hello";
//        //不区分大小写
//        System.out.println(str1.equalsIgnoreCase(str2));//true

        //compareTo方法 ：按照字典序来比较
        // 相等：返回0  小于：返回内容小于0  大于：返回内容大于0
//        String str1 = "hello";
////        String str2 = "world";
//        System.out.println(str1.compareTo(str2));//返回内容小于0
//        String str1 = "hello world";
//        String str2 = "world";
//        //1.通过contains方法判定是否有包含关系
//        System.out.println(str1.contains(str2));//true
//        //2.indexof方法不仅可以查看是否存在，还可查看字符串的所在位置
//        //返回值是str2在str1中的下标位置
//        // 如果查找的内容在str1中重复，返回最左侧字符串下表。
//        System.out.println(str1.indexOf(str2));//6
//        String str3 = "hello world world";
//        //lastIndexOf  从右往左找最匹配的字符串
//        System.out.println(str3.lastIndexOf(str2));
//        //3.startsWith 以什么开头  endsWith  以什么结尾
//        System.out.println(str1.startsWith("h"));//true
//        System.out.println(str1.endsWith("d"));//true


    }
}
