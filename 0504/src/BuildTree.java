import java.util.Scanner;

public class BuildTree {



        static class TreeNode {
            public char val;
            public TreeNode left;
            public TreeNode right;

            public TreeNode(char val) {
                this.val = val;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                String line = scanner.next();

                TreeNode root = buildTree(line);
                inOrder(root);
                System.out.println();
            }
        }
        public static int index = 0;
        private static TreeNode buildTree(String line) {
            index = 0;
            return createTreePreOrder(line);

        }

        private static TreeNode createTreePreOrder(String line) {
            char ch = line.charAt(index);
            if (ch=='#') {
                return null;
            }
            TreeNode node = new TreeNode(ch);
            index++;
            node.left = createTreePreOrder(line);
            index++;
            node.right = createTreePreOrder(line);
            return node;
        }

        public static void inOrder(TreeNode root) {
            if (root==null) {
                return;
            }
            inOrder(root.left);
            System.out.println(root.val+" ");
            inOrder(root.right);
        }



}
