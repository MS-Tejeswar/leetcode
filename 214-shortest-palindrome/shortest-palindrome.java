class Solution {
    public String shortestPalindrome(String s) {
        int ind=s.length();
        while(ind>=1){
            if(check(s.substring(0,ind))){
                s=rev(s.substring(ind,s.length()))+s;
                return s;
            }
            ind--;
        }
        return s;
    }
    public boolean check(String s){
        int l=0,r=s.length()-1;
        int ch=0;
        while(l<=r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }
            else{
                ch=1;
                break;
            }
        }
        if(ch==0)
        return true;
        return false;
    }
    public String rev(String s){
        String n="";
        for(int i=s.length()-1;i>=0;i--)
        n+=s.charAt(i);
        return n;
    }
}