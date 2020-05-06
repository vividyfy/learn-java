public class TestInterview3 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    private StringBuilder stringBuilder = new StringBuilder();
    public String tree2str(TreeNode t) {
        if (t==null) {
            return "";
        }
        helper(t);
        stringBuilder.deleteCharAt(0);
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();
    }

    private void helper(TreeNode root) {
        if (root==null) {
            return;
        }
        stringBuilder.append("(");
        stringBuilder.append(root.val);
        helper(root.left);
        if (root.left==null&&root.right!=null) {
            stringBuilder.append("()");
        }
        helper(root.right);
        stringBuilder.append(")");
    }
}
