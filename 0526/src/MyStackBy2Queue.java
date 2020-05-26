import java.util.LinkedList;
import java.util.Queue;

public class MyStackBy2Queue {
    private Queue<Integer> A = new LinkedList<>();
    private Queue<Integer> B = new LinkedList<>();

    public void push(int x) {
        A.offer(x);
    }

    public Integer pop() {
        if (empty()) {
            return null;
        }
        while (A.size() >= 1) {
            int front = A.poll();
            B.offer(front);
        }
        int ret = A.poll();
        swap(A,B);
        return ret;

    }

    private void swap(Queue<Integer> a, Queue<Integer> b) {
        Queue<Integer> tmp = A;
        A = B;
        B = tmp;
    }

    public Integer peek() {
        if (empty()) {
            return null;
        }
        while (A.size() > 1) {
            int front = A.poll();
            B.offer(front);
        }
        int ret = A.poll();
        B.offer(ret);
        swap(A,B);
        return ret;

    }

    public boolean empty() {
        return A.isEmpty() && B.isEmpty();
    }
}
