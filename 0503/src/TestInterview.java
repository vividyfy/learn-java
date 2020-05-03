
import java.util.ArrayList;
import java.util.List;

public class TestInterview {
    static class Node {
        public Integer val;
        public Node left;
        public Node right;

        public Node(Integer val) {
            this.val = val;
        }
    }
    //二叉树的前序遍历
    public List<Integer> preorderTraversal(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root==null) {
            return result;
        }
        result.add(root.val);
        List<Integer> leftResult = preorderTraversal(root.left);
        for (Integer x:
             leftResult) {
            result.add(x);
        }
        result.addAll(preorderTraversal(root.left));
        result.addAll(preorderTraversal(root.right));
        return result;

    }

    //二叉树的中序遍历
    public List<Integer> inorderTraversal(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root.val==null) {
            return result;
        }
        result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        result.addAll(inorderTraversal(root.right));
        return result;
    }

    //二叉树的后序遍历
    public List<Integer> postorderTraversal(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root==null) {
            return result;
        }
        result.addAll(postorderTraversal(root.left));
        result.addAll(postorderTraversal(root.right));
        result.add(root.val);
        return result;
    }

    //检查两棵树是否相同
    public boolean isSameTree(Node p, Node q) {
        if (p==null&&q==null) {
            return true;
        }
        if (p==null||q==null) {
            return false;
        }
        return (p.val==q.val) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

    //检查一棵树是否是另一棵树的子树
    public boolean isSubtree(Node s, Node t) {
        if (s==null){
            return false;
        }
        return isSameTree(s,t)||
        isSubtree(s.left,t)||
        isSubtree(s.right,t);
    }

    //二叉树的最大深度
    public int maxDepth(Node root) {
        if (root==null) {
            return 0;
        }
        if (root.left==null&&root.right==null) {
            return 1;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return 1 + (Math.max(leftDepth, rightDepth));
    }

    //判断一棵树是否平衡
    public boolean isBalanced(Node root) {
        if (root==null) {
            return true;
        }
        if (root.left==null&&root.right==null) {
            return true;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return (leftDepth-rightDepth<=1&&leftDepth-rightDepth>=-1) && isBalanced(root.left) && isBalanced(root.right);
    }

    //对称二叉树
    public boolean isSymmetric(Node root) {
        if (root==null) {
            return true;
        }
        return isMirror(root.left,root.right);
    }

    private boolean isMirror(Node left, Node right) {
        if (left==null&&right==null) {
            return true;
        }
        if (left==null||right==null) {
            return false;
        }
        return (left.val==right.val) && isMirror(left.left,right.right) && isMirror(left.right,right.left);
    }


}
