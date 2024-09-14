class Solution {
    public int longestSubarray(int[] nums) {
        int c=0;
        int max=0;
        int gap=0;
        int len=0;
        for(int num: nums){
            if(num>max){
                gap=0;
                max=num;
                c=1;
                len=1;
            }
            else if(num==max){
                
                if(gap==0)
                c++;
                else{
                    gap=0;
                    c=1;
                }
              //  System.out.println(num+" "+c);
            }
            else{
                len=Math.max(c,len);
                gap=1;
            }
        } 
        return Math.max(c,len);
    }
}