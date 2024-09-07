class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int i=1;
        int ind=0;
        while(ind!=nums.length){
            if(nums[ind]<=0)
            ind++;
            else{
                if(nums[ind]==i){
                    i++;
                    while(ind<nums.length-1 && nums[ind]==nums[ind+1])
                    ind++;
                    ind++;
                }
                else
                return i;
            }
            
        }
        return i;
    }
}