import java.util.*;
class Solution {
    public int[] plusOne(int[] digits) {
        int[] new_arr=new int[digits.length+1];
        int carry=1;
        for(int i=digits.length-1;i>-1;i--){
            int temp=digits[i]+carry;
            if(temp==10){
                new_arr[i+1]=0;
            }
            else{
                new_arr[i+1]=temp;
                carry=0;
            }
        }
        if(carry==1){
            new_arr[0]=1;
            return new_arr;
        }
        else{
            int[] finale=new int[digits.length];
            finale=Arrays.copyOfRange(new_arr,1,new_arr.length);
            return finale;
        }
        
    }
}