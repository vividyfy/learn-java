public class TestTree {
    static class Node {
        public String val;
        public Node right;
        public Node left;
    }
    public boolean isSameTree(Node p, Node q) {
        if (p==null&&q==null) {
            return true;
        }
        if (p==null||q==null) {
            return false;
        }
        return p.val==q.val && isSameTree(p.right,q.right) &&isSameTree(p.left,q.left);
    }
}
