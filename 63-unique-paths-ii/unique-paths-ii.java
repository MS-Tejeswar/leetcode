class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row=obstacleGrid.length;
        int col=obstacleGrid[0].length;


        if (obstacleGrid == null || obstacleGrid[0][0] == 1 || obstacleGrid[row-1][col-1]==1) 
            return 0;


        
        int[] ans=new int[col];
        ans[0]=1;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(obstacleGrid[i][j]==1)
                ans[j]=0;
                else{
                    if(j>0)
                    ans[j]+=ans[j-1];
                }
            }
        }
        return ans[col-1];
    }
}