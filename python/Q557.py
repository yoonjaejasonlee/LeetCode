# 557. Reverse Words in a String III
# https://leetcode.com/problems/reverse-words-in-a-string-iii/

class Solution:
    def reverseWords(self, s: str) -> str:
        w = s.split()

        a = []

        for i in w:
            a.append(i[::-1])

        return " ".join(a)
