import java.util.Stack;

public class TestInterview4 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public void preOrder(TreeNode root) {
        if (root==null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (stack!=null) {
            TreeNode top = stack.pop();
            System.out.print(top.val+" ");
            if (top.right!=null) {
                stack.push(top.right);
            }
            if (top.left!=null) {
                stack.push(top.left);
            }
        }
    }
}
