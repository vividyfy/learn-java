public class solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null) {
            return head;
        }
        ListNode node = new ListNode(-1);
        node.next = head;
        ListNode prev = node;
        while(head!=null&&head.next!=null) {
            ListNode first = head;
            ListNode second = head.next;
            prev.next = second;
            first.next = second.next;
            second.next = first;
            prev = first;
            head = first.next;
        }
        return node.next;
    }
}
