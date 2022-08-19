from collections import Counter

class Solution(object):
    def minSetSize(self, arr):
        half = len(arr) // 2

        count = Counter(arr)

        counter = 0 ; 

        reverse = sorted(count.values(), reverse=True)
        
        while half > 0:
            mid -= reverse[counter]
            counter += 1
            
        return counter