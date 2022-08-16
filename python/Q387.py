## LeetCode Question 
# 387. First Unique Character in a String
# https://leetcode.com/problems/first-unique-character-in-a-string/

from collections import Counter

class Solution:
    def firstUniqChar(self, s: str) -> int:
        count = Counter(s)
        
        for i , s in enumerate(s):
            if count[s] == 1:
                return i 
        
        
        return -1