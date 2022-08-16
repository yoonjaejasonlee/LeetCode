/* 141. Linked List Cycle 

사이클이 없다면 fast 가 null에 닿게 되고 
사이클이 있다면 slow 와 fast 가 만나게 됨
*/

public class LinkedListCycle {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
        val = x;
        next = null;
             }
         }
    public boolean hasCycle(ListNode head){

        if(head == null){
            return false; 
        }

        ListNode slow = head; 
        ListNode fast = head.next; 


        while(slow != fast){

            if(fast == null || fast.next == null){
                return false; 
            }

            slow = slow.next; 
            fast = fast.next.next; 
        }
        return true; 
    }
}
