# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def averageOfLevels(self, root: Optional[TreeNode]) -> List[float]:
        if not root:
            return
        q=[root,'#']   
        a=[]
        t=0
        c=0
        while q:
            h=q.pop(0)
            if h=='#':
                if q==[]:
                    a.append(t/c)
                    return a
                else:
                    a.append(t/c)
                    q.append('#')
                    t=0
                    c=0
            else:
                t+=h.val
                c+=1
                if h.left:
                    q.append(h.left)
                if h.right:
                    q.append(h.right)
        