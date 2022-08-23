# 234. Palindrome Linked List
# https://leetcode.com/problems/palindrome-linked-list/


class Solution(object):
    def isPalindrome(self, head):
            list = []
            
            while head is not None:
                list.append(head.val)
                head = head.next
                
            if list == list[::-1]:
                return True
            else:
                return False