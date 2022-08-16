# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution(object):
    def isValidBST(self, root):

        if len(root) == 0: 
            return None
        
        for i in root:
            if root[i] is not None and i+1 < len(root):
                self.val = root[i]
                if self.val <= self.left.val or self.val >= self.right.val:
                    return False
                else:
                    return True
        