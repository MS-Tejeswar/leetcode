class Solution {
    public int[][] generateMatrix(int n) {
        int c=1;
        int[] tl={0,0};
        int[] tr={0,n-1};
        int[] bl={n-1,0};
        int[] br={n-1,n-1};
        int[][] arr=new int[n][n];
        while(c<=(n*n)){
            for(int i=tl[1];i<=tr[1];i++){
            arr[tr[0]][i]=c;
            c++;
            if(c>n*n)
            break;
            }
            
            for(int i=tr[0]+1;i<=br[0];i++){
                arr[i][tr[1]]=c;
                c++;
                if(c>n*n)
            break;
            }
            
            for(int i=br[1]-1;i>=bl[1];i--){
                arr[br[0]][i]=c;
                c++;
                if(c>n*n)
            break;
            }
            for(int i=bl[0]-1;i>tl[0];i--){
                arr[i][bl[1]]=c;
                c++;
                if(c>n*n)
                break;
            }
            tl[0]++;
            tl[1]++;
            tr[0]++;
            tr[1]--;
            br[0]--;
            br[1]--;
            bl[0]--;
            bl[1]++;

        }
        return arr;
    }
}