# 637. Average of Levels in Binary Tree
# https://leetcode.com/problems/average-of-levels-in-binary-tree/

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def averageOfLevels(self, root: Optional[TreeNode]) -> List[float]:
        queue = deque([root])
        ans = []

        while queue:
            level = []
            for i in range(len(queue)):
                temp = queue.popleft()
                level.append(temp.val)

                if (temp.right):
                    queue.append(temp.right)
                if (temp.left):
                    queue.append(temp.left)

            ans.append(sum(level) / len(level))
        return ans
