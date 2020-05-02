public class TestTree4 {
    static class Node{
        public char val;
        public TestDemo.Node left;
        public TestDemo.Node right;
    }


    //1.使用静态变量
    public static Node result = null;
    public static void find(Node root, char toFind){
        if (root==null) {
            return;
        }
        if (root.val==toFind) {
            result = root;
            return;
        }
        find(root.left,toFind);
        find(root.right,toFind);
    }


    //2.不使用静态变量
    public static TestDemo.Node find(TestDemo.Node root, char toFind) {
        if (root==null) {
            return null;
        }
        if (root.val==toFind) {
            return root;
        }
        TestDemo.Node result = find(root.left,toFind);
        if (result!=null) {
            return result;
        }
        return find(root.right,toFind);
    }

}
