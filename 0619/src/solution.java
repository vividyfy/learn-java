public class solution {
    static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
    }
    public void Mirror(TreeNode root) {
        TreeNode tmp = null;
        if (root != null) {
            tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            if (root.left != null) {
                Mirror(root.left);
            }
            if (root.right != null) {
                Mirror(root.right);
            }
        }
    }
}
