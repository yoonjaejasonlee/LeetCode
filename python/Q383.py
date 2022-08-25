#383. Ransom Note
#https://leetcode.com/problems/ransom-note/

class Solution(object):
    def canConstruct1(self, ransomNote, magazine):
        for i in set(ransomNote):
            if ransomNote.count(i) > magazine.count(i):
                return False
        
        return True
    
  
    def canConstruct(self, ransomNote, magazine):
        og = []
        
        if len(magazine) < len(ransomNote):
            return False
        
        for i in magazine:
            og.append(i)
        
        for j in ransomNote:
            if j in og:
                og.remove(j)
            else:
                return False
            
        return True