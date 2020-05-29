
public class TestTree2 {
    static class Node {
        public char val;
        public Node left;
        public Node right;

        public Node(char val) {
            this.val = val;
        }
    }
    static Node buildTree() {
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        A.left = B;
        A.right = C;
        B.left = D;
        C.right = E;
        return A;
    }

    //求结点个数
    public static int size(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }
    static int size3 = 0;
    public static void size3(Node root) {
        if (root==null) {

        }
        size3++;
        if (root.left!=null) {
            size3++;
            return;
        }
        if (root.right!=null) {
            size3++;
            return;
        }
        size3(root.left);
        size3(root.right);
    }

    static int size2 = 0;
    public static void leafSize(Node root) {
        if (root == null) {
            return;
        }
        if (root.left == null || root.right == null) {
            size2++;
            return;
        }
        leafSize(root.left);
        leafSize(root.right);
    }

    public static int leafSize2(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null || root.right == null) {
            return 1;
        }
        return leafSize2(root.left) + leafSize2(root.right);
    }

    public static int getLevelSize(Node root, int k) {
        if (root == null || k < 1) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        return getLevelSize(root.left, k-1) + getLevelSize(root.right, k-1);
    }

    public static Node 

    public static void main(String[] args) {
        Node root = buildTree();
        leafSize(root);
        //System.out.println(size2);
        //System.out.println(leafSize2(root));
        size3(root);
        //System.out.println(size3);
        System.out.println(getLevelSize(root, 2));

    }

}
