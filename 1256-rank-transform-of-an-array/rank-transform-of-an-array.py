class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        a=list(set(arr[:]))
        a.sort()
        d=dict()
        ind=1
        for i in range(len(a)):
            if i==len(a)-1 or a[i]!=a[i+1]:
                d[a[i]]=ind
                ind+=1
        for i in range(len(arr)):
            arr[i]=d[arr[i]]
        return arr