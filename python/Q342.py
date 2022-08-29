class Solution(object):
    def isPowerOfFour(self, n):
        if n == 1:
            return True
        
        while n >= 4 :
            n = n // 4.0
        
        if n == 0:
            return True
        else:
            return False
            