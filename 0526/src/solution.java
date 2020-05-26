import java.util.Stack;

public class solution {
    public boolean isValid(String s) {
        //1、创建栈保存字符类型
        Stack<Character> stack = new Stack<>();
        //2、循环遍历每一个字符
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            //3、判断tmp是否是左括号，如果是，入栈
            if ((tmp == '(') || (tmp == '{') || (tmp == '[')) {
                stack.push(tmp);
                continue;
            }
            if (stack.empty()) {
                //如果当前栈为空，返回false
                return false;
            }
            //4、取出栈顶元素进行对比
            char top = stack.pop();
            if (top == '(' && tmp == ')') {
                continue;
            }
            if (top == '{' && tmp == '}') {
                continue;
            }
            if (top == '[' && tmp == ']') {
                continue;
            }
            //除上述三种情况之外，其他都错误
            return false;
        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }
}
