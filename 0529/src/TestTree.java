
import java.util.LinkedList;
import java.util.Queue;

public class TestTree {
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

    //先序遍历
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //中序遍历
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    //后序遍历
    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    //层序遍历
    public static void levelOrder(Node root) {
        if (root==null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
           Node cur = queue.poll();
            System.out.print(cur.val + " ");
            if (cur.left!=null) {
                queue.offer(cur.left);
            }
            if (cur.right!=null) {
                queue.offer(cur.right);
            }
        }
    }

    public static void main(String[] args) {
        Node root = buildTree();
        preOrder(root);//A B D C E
        System.out.println();
        inOrder(root);//D B A C E
        System.out.println();
        postOrder(root);//D B E C A
        System.out.println();
        levelOrder(root);//A B C D E
    }
}
