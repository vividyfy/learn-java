public class TestTree2 {
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
    public boolean isSubtree(Node s, Node t) {
        if (s==null) {
            return false;
        }
        //return isSameTree(s,t) || isSameTree(s.left,t) ||isSameTree(s.right,t);
    }
}
