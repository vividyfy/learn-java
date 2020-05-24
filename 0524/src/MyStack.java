public class MyStack {
    //基于顺序表实现一个栈
    private int[] array = new int[100];
    private int size;

    //入栈
    public void push(int value){
        //将value放到数组末尾
        array[size] = value;
        size++;
    }

    //出栈
    public Integer pop() {
        if (size<0) {
            return null;
        }
        int ret = array[size-1];
        size--;
        return ret;
    }

    //取栈顶元素
    public Integer peek() {
        if (size<0) {
            return null;
        }
        return array[size-1];
    }
}
