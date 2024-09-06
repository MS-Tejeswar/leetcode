class Solution {
    public int climbStairs(int n) {
        int[] grid= new int[n];
        if(n<4)
        return n;

        grid[0]=1;
        grid[1]=2;
        for(int i=2;i<n;i++)
        grid[i]=grid[i-1]+grid[i-2];

        return grid[n-1];
    }
}