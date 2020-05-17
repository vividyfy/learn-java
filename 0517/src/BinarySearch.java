public class BinarySearch {
    static class Node {
        public int key;
        public Node left;
        public Node right;
        public int value;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    private Node root = null;

    public Node find(int key) {
        Node cur = root;
        while (cur!=null) {
            if (key < cur.key) {
                cur = cur.left;
            } else if (key > cur.key) {
                cur = cur.right;
            }else {
                return cur;
            }
        }
        return null;
    }
    public Node insert(int key, int value) {
        //1、树是空树
        if (root==null) {
            root = new Node(key,value);
            return root;
        }
        //2、先找到key所在的位置
        Node cur = root;
        Node prev = null;
        while (cur!=null) {
            if (key < cur.key) {
                prev = cur;
                cur = cur.left;
            } else if (key > cur.key) {
                prev = cur;
                cur = cur.right;
            } else {
                cur.value = value;
            }
        }
        Node newNode = new Node(key,value);
        if (newNode.key < prev.key) {
            prev.left = newNode;
        } else {
            prev.right = newNode;
        }
        return newNode;
    }
    public void remove(int key) {
        
    }


}
