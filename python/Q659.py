import collections
## LeetCode Question 
# 659. Split Array into Consecutive Subsequences
# https://leetcode.com/problems/split-array-into-consecutive-subsequences/

# ex [1,2,3,3,4,5] -> [1,2,3] , [3,4,5] // [1,2,3,3,4,4,5,5] -> [1,2,3,4,5] , [3,4,5]
# 1. 나눴을때 순서대로 진행이 되어야함. 
# 2. 나눴을때 한 리스트의 길이가 최소 3이여야함. 


class Solution(object):

    def isPossible(self, nums):

        one = collections.Counter()
        two = collections.Counter()
        three = collections.Counter()

        for x in nums:
            if one[x-1] > 0:
                one[x-1] -= 1
                two[x] += 1
                continue
            
            if two[x-1] > 0:
                two[x-1] -= 1
                two[x] += 1
                continue

            if three[x-1] > 0:
                three[x-1] -= 1
                three[x] += 1
                continue

            one[x] +=1

        if one.total() > 0 or two.total() > 0 :
            return False
        return True




       
            
            