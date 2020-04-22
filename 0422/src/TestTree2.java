public class TestTree2 {
    static class Node {
        public char val;
        public Node right;
        public Node left;

        public Node(char val) {
            this.val = val;
        }
    }
    public int maxDepth(Node root) {
        if (root==null) {
            return 0;
        }
        if (root.left==null&&root.right==null) {
            return 1;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return 1 + Math.max(leftDepth,rightDepth);
    }
    public boolean isBalance(Node root) {
        if (root == null) {
            return true;
        }
        if (root.right==null&&root.left==null) {
            return true;
        }
        int left  = maxDepth(root.left);
        int right = maxDepth(root.right);
        return  (left - right <= 1 && right - left >= -1) && isBalance(root.left) &&isBalance(root.right);
    }
}
