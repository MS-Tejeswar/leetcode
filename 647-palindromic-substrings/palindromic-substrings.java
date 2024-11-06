class Solution {
    int count=0;
    public int countSubstrings(String s) {
        if(s==null || s.length()==0) return 0;

        for(int i=0;i<s.length();i++){
            extend(s,i,i);
            extend(s,i,i+1);
        }
        return count;
        
    }
    public void extend(String s, int l, int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
            count++;
        }
    }
}