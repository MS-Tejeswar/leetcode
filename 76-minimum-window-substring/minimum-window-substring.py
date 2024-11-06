class Solution:
    def minWindow(self, s: str, t: str) -> str:
        stack=list(t)
        v=[]
        mini="_"*99999
        for i in range(len(s)):
            if s[i] in stack:
                v.append((i,s[i]))
                stack.pop(stack.index(s[i]))

                if stack==[]:
                    l=v[0][0]
                    r=v[-1][0]
                    if r-l+1<len(mini):
                        mini=s[l:r+1]
                    stack.append(v[0][1])
                    v=v[1:]
            elif s[i] in t:
                for j in v:
                    if j[1]==s[i]:
                        v.remove(j)
                        v.append((i,s[i]))
                        break
          #  print(stack,v)
        if len(mini)==99999:
            return ""
        return mini

