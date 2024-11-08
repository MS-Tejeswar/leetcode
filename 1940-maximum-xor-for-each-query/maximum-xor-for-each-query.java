class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int[] a=new int[nums.length];
        int t=nums[0];
        a[0]=Math.abs(t-(int) Math.pow(2,maximumBit)+1);
        for(int i=1;i<nums.length;i++){
            t^=nums[i];
            a[i]=Math.abs(t-(int) Math.pow(2,maximumBit)+1);
        }
        int[] b=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            b[nums.length-1-i]=a[i];
        }
        return b;
            
    }
}