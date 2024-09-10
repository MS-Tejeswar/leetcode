class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row_len=matrix.length;
        int col_len=matrix[0].length;
        if(row_len==1){
            for(int i=0;i<col_len;i++)
            if(matrix[0][i]==target)
            return true;
            return false;
        }
        

        for(int i=0;i<row_len;i++){
            if(matrix[i][0]==target)
            return true;
            if(matrix[i][0]>target){
                if(i==0)
                return false;



                for(int j=0;j<col_len;j++){
                    if(matrix[i-1][j]==target)
                    return true;
                }
                return false;
            }
            else if(i==row_len-1){
                for(int j=0;j<col_len;j++){
                    if(matrix[i][j]==target)
                    return true;
                }
            }
        }
        return false;
    }
}