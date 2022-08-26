#869. Reordered Power of 2
#https://leetcode.com/problems/reordered-power-of-2/

class Solution(object):
    def reorderedPowerOf2(self, n):
        n = sorted(str(n))
        
        for i in range(30):
            x = sorted(str(2 ** i))
            if x == n:
                return True
        
        return False 