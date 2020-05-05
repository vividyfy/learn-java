public class TestInterview {
    static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public TreeNode lca = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null) {
            return null;
        }
        find(root,p,q);
        return lca;
    }

    private boolean find(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null) {
            return false;
        }
        int left = find(root.left,p,q)?1:0;
        int right = find(root.right,p,q)?1:0;
        int mid = (root==p||root==q)?1:0;
        if (left+right+mid==2) {
            lca = root;
        }
        return (left+mid+right>0);
    }
}
