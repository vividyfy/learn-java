public class TestTree {
    static class Node {
        public char val;
        public Node right;
        public Node left;

        public Node(char val) {
            this.val = val;
        }
    }

    static Node build() {
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

    //先序遍历：先访问根节点，递归访问左子树，再递归访问右子树。
    public static void preOrder(Node root) {
        if(root==null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = build();
        preOrder(root);

    }
}
