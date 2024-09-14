class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0,ch=0;
        String d="";
        
        while(true){
            if(i>=word1.length()){
                d+=word2.substring(j,word2.length());
                return d;
            }
            else if(j>=word2.length()){
                d+=word1.substring(i,word1.length());
                return d;
            }
            else{
                if(ch%2==0){
                d+=String.valueOf(word1.charAt(i));
                i++;}
                else{
                    d+=String.valueOf(word2.charAt(j));
                    j++;
                }
                ch++;
            }
        }
    }
}