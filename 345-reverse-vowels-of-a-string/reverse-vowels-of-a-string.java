class Solution {
    public String reverseVowels(String s) {
        List<Character> vow=new ArrayList<>();
        vow.add('a');
        vow.add('e');
        vow.add('i');
        vow.add('o');
        vow.add('u');
        vow.add('A');
        vow.add('E');
        vow.add('I');
        vow.add('O');
        vow.add('U');

        List<Character> new_vow=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(vow.contains(s.charAt(i)))
            new_vow.add(s.charAt(i));
        }
        int ind=new_vow.size()-1;
        String f="";
        for(int i=0;i<s.length();i++){
            if(vow.contains(s.charAt(i))){
                f+=new_vow.get(ind--);
                
            }
            else
            f+=s.charAt(i);
        }
        return f;
        
    }
}