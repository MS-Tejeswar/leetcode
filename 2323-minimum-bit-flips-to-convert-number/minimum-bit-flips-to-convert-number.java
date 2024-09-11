class Solution {
    public int minBitFlips(int start, int goal) {
      
      String e_rev=Integer.toBinaryString(goal);
      String s_rev=Integer.toBinaryString(start);
      if(e_rev.length()<s_rev.length()){
        int c=s_rev.length()-e_rev.length();
        while(c>0){
            c--;
            e_rev="0"+e_rev;
        }
      }
      else if(e_rev.length()>s_rev.length()){
        int c=e_rev.length()-s_rev.length();
        while(c>0){
            c--;
           s_rev="0"+s_rev;
        }
      }
      int c=0;
      for(int i=0;i<s_rev.length();i++){
        if(e_rev.charAt(i)!=s_rev.charAt(i))
        c++;
      }
      return c;
    }

}