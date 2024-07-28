# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumNumbers(self, root: Optional[TreeNode]) -> int:
        arr=[0]
        def recur(node,parents):
            if node.left==None and node.right==None:
                print(int(''.join(parents)+str(node.val)))
                arr[0]+= int(''.join(parents)+str(node.val))
            else:
                parents.append(str(node.val))
                g=parents[:]
                if node.left:
                    recur(node.left,parents)
                if node.right:
                    recur(node.right,g)
        recur(root,[])
        return arr[0]