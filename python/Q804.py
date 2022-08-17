#804. Unique Morse Code Words
#https://leetcode.com/problems/unique-morse-code-words/

class Solution(object):
    def uniqueMorseRepresentations(self, words):
        morse = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]

        temp = set()

        for s in words:
            why = ""
            for x in s:
                why+=morse[ord(x) - ord('a')]
            temp.add(why)
        
        return len(temp)