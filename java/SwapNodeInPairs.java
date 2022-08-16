public class SwapNodeInPairs {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode swapPairs(ListNode head){
        ListNode temp = new ListNode(0);
        temp.next = head; 
        ListNode current = temp; 

        while(current.next != null && current.next.next != null){
            ListNode one = current.next;
            ListNode two = current.next.next; 

            one.next = two.next; 
            current.next = two; 
            current.next.next = one;

            current = current.next.next; 
            
        }
        return temp.next;
    }
}
