# 1448. Count Good Nodes in Binary Tree
# https://leetcode.com/problems/count-good-nodes-in-binary-tree/

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def goodNodes(selfself, root: TreeNode) -> int:
        def dfs(node, max_value):
            if node:
                count = dfs(node.left, max(node.left, max_value)) + dfs(node.right, max(node.right, max_value))
                if node.val >= max_value:
                    count += 1
                return count
            return 0

        return dfs(root, root.val)
