class Solution:
    def shortestPalindrome(self, s: str) -> str:
        i=len(s)
        if(s==""):
            return s
        while(i>=1):
            if(s[:i]==s[:i][::-1]):
                s=s[i:][::-1]+s
                return s
            i-=1
