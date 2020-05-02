public class TestTree2 {

    //1.使用静态变量
    public static int leafSize = 0;
    public static void size(TestDemo.Node root) {
        if (root==null) {
            return;
        }
        if (root.left==null&&root.right==null) {
            leafSize++;
        }
        size(root.left);
        size(root.right);
    }
    //2.不使用静态变量
    public static int leafSize(TestDemo.Node root) {
        if (root==null) {
            return 0;
        }
        if (root.right==null&&root.left==null) {
            return 1;
        }
        return leafSize(root.left) + leafSize(root.right);
    }
}
