import java.util.Stack;

public class TestInterview2 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public void postOrder(TreeNode root) {
        if (root==null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode prev = null;
        while (true) {
            //1、cur往左找，遇到的非空结点都入栈
            while (cur!=null) {
                stack.push(cur);
                cur = cur.left;
            }
            //2、取栈顶元素，满足右子树为空或已经被访问过，则该元素可以访问
            if (stack.empty()) {
                break;
            }
            TreeNode top = stack.peek();
            if (top.right==null||top.right==prev) {
                System.out.println(top.val+" ");
                stack.pop();
                prev = top;
            } else {
                cur = cur.right;
            }
        }
    }
}
