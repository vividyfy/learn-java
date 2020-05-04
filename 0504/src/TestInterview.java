import java.util.LinkedList;
import java.util.Queue;

//判断二叉树是不是完全二叉树
public class TestInterview {
    static class Node {
        public char val;
        public Node left;
        public Node right;

        public Node(char val) {
            this.val = val;
        }
    }
    public boolean isComplete(Node root) {
        if (root == null) {
            return true;
        }

        //这个变量为true表示当前在第一阶段，为false表示进入第二阶段
        boolean isFirstStep = true;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (queue.isEmpty()) {
            Node cur = queue.poll();

            if (isFirstStep) {
                //第一阶段要求两个结点必须具备两个子树

                if (cur.left != null && cur.right != null) {
                    //当前结点有两个子树，直接把子数入队列，继续往后遍历
                    queue.offer(root.left);
                    queue.offer(root.right);
                } else if (cur.right != null && cur.left == null) {
                    //右子树为空，左子树非空，一定不是完全二叉树
                    return false;
                } else if (cur.left != null && cur.right != null) {
                    //左子树非空，右子树为空，进入第二阶段
                    isFirstStep = false;
                    queue.offer(cur.left);
                } else {
                    //两个结点都为空，进入第二阶段
                    isFirstStep = false;
                }
            } else {
                //要求任意节点必须没有子树
                if (cur.right != null && cur.left == null) {
                    return false;
                }
            }
        }
        return true;
    }
}
