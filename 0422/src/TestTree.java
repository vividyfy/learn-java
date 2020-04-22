public class TestTree {
    static class Node {
        public char val;
        public Node right;
        public Node left;
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
}
