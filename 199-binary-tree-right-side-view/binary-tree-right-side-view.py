# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        a=[]
        q=[root,'#']
        prev=None
        l=[]
        if root is None:
            return
        while q:
            h=q.pop(0)
            if h=='#':
                if q==[]:
                    l.append(prev.val)
                    break
                else:
                    l.append(prev.val)
                    q.append('#')
            else:
                if h.left:
                    q.append(h.left)
                if h.right:
                    q.append(h.right)
                prev=h
        return l
            
        