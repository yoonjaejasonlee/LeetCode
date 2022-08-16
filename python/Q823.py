class Solution(object):
        def numFactoredBinaryTrees(self, arr):
            arr.sort() #순서대로 소팅 진행
            dp = {}

            for n in arr:
                dp[n] = 1

            for i, n in enumerate(arr):
                for j in range(i):
                    if not (n % arr[j]) and n // arr[j] in dp:
                        dp[n] += dp[arr[j]] * dp[n//arr[j]]
                        dp[n] %= 10**9+7

            return sum(dp.values()) % (10**9+7)
