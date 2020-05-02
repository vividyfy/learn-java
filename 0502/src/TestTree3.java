public class TestTree3 {
    public static int kLevelSize(TestDemo.Node root, int k) {
        if (root==null||k<1) {
            return 0;
        }
        if (k==1) {
            return 1;
        }
        return kLevelSize(root.left, k-1) + kLevelSize(root.right, k-1);
    }
}
