import java.util.Stack;

public class MyQueueBy2Stack {
    Stack<Integer> A = new Stack<>();
    Stack<Integer> B = new Stack<>();

    public void push(int x) {
        while (!B.isEmpty()) {
            int tmp = B.pop();
            A.push(tmp);
        }
        A.push(x);

    }

    public Integer pop() {
        if (empty()) {
            return null;
        }
        while (!A.isEmpty()) {
            int tmp = A.pop();
            B.push(tmp);
        }
        return B.pop();
    }

    public Integer peek() {
        if (empty()) {
            return null;
        }
        while (!A.isEmpty()) {
            int tmp = A.pop();
            B.push(tmp);
        }
        return B.peek();
    }

    public boolean empty() {
        return A.empty() && B.empty();
    }


}
