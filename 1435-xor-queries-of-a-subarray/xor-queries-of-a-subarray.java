class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int ind=0;
        int[] ans=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int l=queries[i][0],r=queries[i][1];
            int temp=arr[l];
            for(int j=l+1;j<=r;j++){
                temp^=arr[j];
            }
            ans[ind]=temp;
            ind++;
        }
        return ans;
        
    }
}