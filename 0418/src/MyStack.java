public class MyStack {
    //栈可以基于顺序表实现，也可以基于链表实现。
    private int[] array = new int[100];
    //array中[0,size)区间中的元素是栈中的有效元素
    //0号元素相当于栈底，size-1号元素是栈顶
    private int size = 0;

    //入栈操作
    public void push(int value) {
        //把value元素放到数组末尾，此处没有考虑扩容
        array[size] = value;
        size++;
    }

    //出栈
    public Integer pop() {
        if (size<=0) {
            return null;
        }
        int ret = array[size-1];
        size--;
        return size;
    }

    //取栈顶元素
    public Integer peek() {
        if (size<=0) {
            return null;
        }
        int ret = array[size-1];
        return size;
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);


        while (true) {
            Integer cur = myStack.pop();
            if (cur==null) {
                break;
            }
            System.out.println(cur);
        }
    }
}
