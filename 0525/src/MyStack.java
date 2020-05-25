public class MyStack {
    private int[] array = new int[100];
    private int size = 0;
    public void push(int val) {
        array[size] = val;
        size++;
    }
    public Integer pop() {
        if (size<0) {
            return null;
        }
        int ret = array[size-1];
        size--;
        return ret;
    }

    public Integer peek() {
        if (size<0) {
            return null;
        }
        return array[size-1];
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(9);
        myStack.push(5);
        myStack.push(2);
        myStack.push(7);
        myStack.push(3);

    }
}
