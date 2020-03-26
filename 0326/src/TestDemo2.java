class ListNode {
    public ListNode next;
    public int data;
    public ListNode(int data) {
        this.next = null;
        this.data = data;
    }
}
    public class TestDemo2{
    public ListNode head;
        public int size() {
            ListNode cur = this.head;
            int count = 0;
            while (cur != null) {
                count++;
                cur = cur.next;
            }
            return count;
        }

        public ListNode FindKthToTail(int k) {
            if (k <= 0 || k > size()) {
                return null;
            }
            ListNode fast = this.head;
            ListNode slow = this.head;

            for (int i = 0; i < k; i++) {
                fast = fast.next;
            }
            while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }
            return slow;
        }
    }



