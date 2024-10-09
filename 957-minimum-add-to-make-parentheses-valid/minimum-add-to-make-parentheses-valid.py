class Solution:
    def minAddToMakeValid(self, s: str) -> int:
        a=[]
        c=0
        for i in s:
            if i=='(':
                a.append('(')
            else:
                if a!=[]:
                    a.pop()
                else:
                    c+=1
        return c+len(a)

        