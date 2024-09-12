class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        List<Character> arr=new ArrayList<>();
        for(int i=0;i<allowed.length();i++)
        arr.add(allowed.charAt(i));
        int c=0;
        for(int i=0;i<words.length;i++){
            String curr=words[i];
            for(int j=0;j<curr.length();j++){
                if(arr.contains(curr.charAt(j))){
                if(j==curr.length()-1)
                c++;
            }
            else
            break;

            }
        }
        return c;
    }
}