class Solution {
    public Node middleNode(Node head) {
        if (head==null) {
            return null;
        }
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}public class TestDemo {
    public static void main(String[] args) {
    }
}
