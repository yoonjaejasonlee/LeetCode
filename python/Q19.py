#19. Remove Nth Node from End Of List


class ListNode:
    def __init__(self) -> None:
        self.val = self
        self.next = next 

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n:int) -> Optional[ListNode]:

        fast, slow = head, head

        for _ in range(n):
            fast = fast.next

        if not fast:
            return head.next
        
        while fast.next:
            slow = slow.next
            fast = fast.next
        

        slow.next = slow.next.next

        return head