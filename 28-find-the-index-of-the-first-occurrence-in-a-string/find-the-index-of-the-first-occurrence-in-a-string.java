class Solution {
    public int strStr(String haystack, String needle) {
        int a=needle.length();
        int c=0;
        int ind=0;
        if(haystack.equals(needle))
        return 0;
        for(int i=0;i<=haystack.length()-a;i++){
            String newe=haystack.substring(i,i+a);
            if(newe.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}