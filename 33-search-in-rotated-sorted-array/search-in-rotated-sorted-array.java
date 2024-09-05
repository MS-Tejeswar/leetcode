class Solution {
    public int search(int[] nums, int target) {
        int ch=0;
        if(nums[0]==target)
        return 0;
        else if(nums[0]<target)
        ch=1;

        int check=0;
        if(ch==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==target){
                
                return i;}
               // System.out.println(i);
                if(i!=nums.length-2 && i!=nums.length-1 && nums[i]>nums[i+1])
                return -1;
            }
        }
        else{
          //  System.out.println("hi");
            int ind=0;
            for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1])
            ind++;
            else{
            break;}
            }
            System.out.print(ind);
            for(int i=ind;i<nums.length;i++)
            if(nums[i]==target)
            return i;

            return -1;
        }
        return -1;
    }
}