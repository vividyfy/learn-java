class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;

    }
}
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode newHead = new ListNode(0);
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        ListNode tmp = newHead;
        while(cur1!=null&&cur2!=null) {
            if (cur1.val < cur2.val) {
                tmp.next = cur1;
                cur1 = cur1.next;
                tmp = cur1;
            }else {
                tmp.next = cur2;
                tmp = cur2;
                cur2 = cur2.next;
            }
        }
        if(cur1!=null) {
            tmp.next = cur1;
        }
        if(cur2!=null) {
            tmp.next = cur2;
        }
        return newHead.next;
    }
}
