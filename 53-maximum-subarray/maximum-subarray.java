class Solution {
    public int maxSubArray(int[] nums) {
        int r=nums[0];
        int tot=0;
        for(int n:nums){
            if(tot<0)
            tot=0;

            tot+=n;
            r=Math.max(r,tot);
        }
        return r;

        
    }
}