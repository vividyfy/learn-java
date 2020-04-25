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

    public void levelOrder(Node root) {
        if (root==null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            System.out.println(cur.val + " ");
            if (cur.left!=null) {
                queue.offer(cur.left);
            }
            if (cur.right!=null) {
                queue.offer(cur.right);
            }
        }
    }

}
