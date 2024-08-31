import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> re=new ArrayList<>();
        if(s==null || s.length()==0 || words==null || words.length==0)
        return re;

        int word_len=words[0].length();
        int full_len=words.length*word_len;

        Map<String,Integer> map=new HashMap<>();
        for(String word:words){
            map.put(word, map.getOrDefault(word,0)+1);
        }

        for(int i=0;i<word_len;i++){
            int left=i;
            int right=i;
            int count=0;
            Map<String,Integer> curr=new HashMap<>();
            while(right+word_len<=s.length()){
                String temp=s.substring(right,right+word_len);
                right+=word_len;

                if(map.containsKey(temp)){
                    curr.put(temp,curr.getOrDefault(temp,0)+1);
                    count++;
                

                while(curr.getOrDefault(temp,0)>map.getOrDefault(temp,0)){
                    String leftword=s.substring(left,left+word_len);
                    curr.put(leftword,curr.get(leftword)-1);
                    count--;
                    left+=word_len;
                }
                if(count==words.length){
                    re.add(left);
                }
                }else{
                    curr.clear();
                    left=right;
                    count=0;
                }
            }
        }
        return re;
    }
}