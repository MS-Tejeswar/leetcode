class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int curr=0;
        for(int i=0;i<rolls.length;i++)
        curr+=rolls[i];

        int tot=(rolls.length+n)*mean;
        System.out.println(tot+" "+curr);
        int f=tot-curr;
        int[] bruh={};
        if(f<0)
        return bruh;

        if(f>6*n)
        return bruh;

        int[] new_arr=new int[n];
        for(int i=0;i<n;i++)
        new_arr[i]=0;

        int count=0;
        int ind=0;
        int ch=0;
        while(count!=f){
            count+=1;
            new_arr[ind]+=1;
            if(ind==n-1)
            ch++;
            ind=(ind+1)%n;
        }
        if(ch>0)
        return new_arr;

        return bruh;

        


    }
}