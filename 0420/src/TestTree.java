public class TestTree {
    static class Node {
        public char val;
        public Node right;
        public Node left;

        public Node(char val) {
            this.val = val;
        }
    }

    public static Node build() {
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.right = F;
        E.right = G;
        return A;
    }
    //树中的结点个数
    public static int size(Node root) {
        if (root==null) {
            return 0;
        }
        //整个树的结点个数 = 根节点个数 + 左子树结点个数 + 右子树结点个数
        return 1+size(root.left)+size(root.right);
    }

    //当前树中叶子结点的个数
    public static int leafSize = 0;
    //public static void leafSize(Node root) {
//        if (root==null) {
//            return;
//        }
//        if (root.right==null || root.left==null) {
//            leafSize++;
//            return;
//        }
//        //leafSize(root.left);
//        //leafSize(root.right);
//    }

    public static int leafSize(Node root) {
        if (root==null) {
            return 0;
        }
        if (root.right==null || root.left==null) {
            return 1;
        }
        return leafSize(root.left) + leafSize(root.right);
    }


    


    public static void main(String[] args) {
        Node root = build();
        System.out.println(size(root));
        leafSize(root);
        System.out.println(leafSize);
        System.out.println(leafSize(root));
    }
}
