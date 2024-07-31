class Solution:
    def solve(self, board: List[List[str]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        import copy
        arr=[]
        v=[]
        c=[0]
        dupe=copy.deepcopy(board)
        lmao=[]
        def func(i,j):
            if i<0 or i>=len(dupe) or j<0 or j>=len(dupe[0]) or dupe[i][j]=='X' or dupe[i][j]=='-':
                return
           # print(i,j)
            dupe[i][j]='-'
            arr.append([i,j])
            if i==0 or i==len(dupe)-1 or j==0 or j==len(dupe[0])-1:
                c[0]=-1
                
            func(i+1,j)
            func(i-1,j)
            func(i,j+1)
            func(i,j-1)
        for i in range(len(dupe)):
            for j in range(len(dupe[0])):
                if dupe[i][j] not in '-X':
                    func(i,j)
                    check=1
                  #  print(arr,len(board),len(board[0]))
                    if c[0]==-1:
                        check=0
                        c=[0]   
                    if check:
                        lmao.extend(arr)
                   # print(board)
                    arr=[]
      #  print(lmao)
        for x,y in lmao:
            board[x][y]='X'
        #print(dupe)
       # board=copy.deepcopy(dupe)

        