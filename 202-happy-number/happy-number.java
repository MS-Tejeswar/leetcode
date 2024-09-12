class Solution {
    public boolean isHappy(int n) {
        List<Integer> arr=new ArrayList<>();
        while(true){
            if(arr.contains(n))
            return false;
            arr.add(n);
            int temp=0;
            while(n!=0){
                int k=n%10;
                temp+=k*k;
                n/=10;
            }
            n=temp;
            if(n==1)
            return true;
        }
        
    }
}