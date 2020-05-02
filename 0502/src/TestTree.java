public class TestTree {
    static class Node{
        public char val;
        public TestDemo.Node left;
        public TestDemo.Node right;
    }
    //1.使用静态变量
    public static int size = 0;
    public void size(Node root) {
        if (root==null) {
            return;
        }
        size++;
        size(root.left);
        size(root.right);
    }
    //2.不使用静态变量
    public static int size2(Node root) {
        if (root==null) {
            return 0;
        }
        return 1 + size2(root.left) + size2(root.right);
   }
}
