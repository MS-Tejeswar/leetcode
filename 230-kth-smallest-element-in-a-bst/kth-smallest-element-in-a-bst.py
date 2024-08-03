# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        a=[]
        def inorder(node):
            if not node:
                return
            a.append(node.val)
            inorder(node.left)
            inorder(node.right)
        inorder(root)
        a.sort()
        
        print(a)
        if a==[]:
            return 0
        return a[k-1]
        