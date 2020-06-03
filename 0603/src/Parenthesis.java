import java.util.Stack;

public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        if (n % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            char tmp = A.charAt(i);
            if ((tmp == '(') || (tmp == '[') || (tmp == '{')) {
                stack.push(tmp);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }
            Character cur = stack.pop();
            if (cur == '(' && tmp == ')') {
                continue;
            }
            if (cur == '[' && tmp == ']') {
                continue;
            }
            if (cur == '{' && tmp == '}') {
                continue;
            }
            return false;
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
