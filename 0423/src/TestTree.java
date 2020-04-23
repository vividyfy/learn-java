public class TestTree {
    static class Node {
        public char val;
        public Node left;
        public Node right;

        public Node(char val) {
            this.val = val;
        }
    }
    public static int kLevelSize(Node root, int k) {
        if (root==null || k < 1) {
            return 0;
        }
        if (k==1) {
            return 1;
        }
        return kLevelSize(root.left,k-1) + kLevelSize(root.right,k-1);
    }
}
