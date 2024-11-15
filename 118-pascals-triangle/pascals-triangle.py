class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        a=[]
        for i in range(numRows):
            if i==0:
                a.append([1])
                continue
            b=[]
            for j in range(i+1):
                if j==0:
                    b.append(a[i-1][0])
                elif j==i:
                    b.append(a[i-1][-1])
                else:
                    b.append(a[i-1][j-1]+a[i-1][j])
            
            a.append(b[:])
        return a
        