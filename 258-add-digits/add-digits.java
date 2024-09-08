class Solution {
    public int addDigits(int num) {
        int a=0;
        while(!(num<10)){
            while(num!=0){
            a+=num%10;
            num/=10;}
         //   System.out.println(a+" "+)}
            num=a;
            a=0;
        
        }
        return num;
    }
}