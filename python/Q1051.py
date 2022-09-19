#1051. Height Checker
#https://leetcode.com/problems/height-checker/


class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        temp = sorted(heights)
        counter = 0
        
        
        for i in range(len(heights)):
            if heights[i] != temp[i]:
                counter += 1
                
        s
        return counter 