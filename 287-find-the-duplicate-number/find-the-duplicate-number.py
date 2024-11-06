class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        d=dict()
        for i in nums:
            h=d.get(i,0)
            if h==0:
                d[i]=1
            else:
                return i