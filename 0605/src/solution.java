import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        if (!stack2.isEmpty()) {
            Integer tmp = stack2.pop();
            stack1.push(tmp);
        }
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.isEmpty()) {
            Integer cur = stack1.pop();
            stack2.push(cur);
        }
        return stack2.pop();
    }
}


