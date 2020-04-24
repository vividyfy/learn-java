public class TestTree {
    static class Node {
        public char val;
        public Node right;
        public Node left;

        public Node(char val) {
            this.val = val;
        }
    }

    public boolean isMirror(Node root1, Node root2) {
        if (root1==null && root2==null) {
            return true;
        }
        if (root1==null || root2==null) {
            return false;
        }
        return (root1.val==root2.val) && isMirror(root1.left,root2.right) && isMirror(root1.right,root2.left);
    }
}
