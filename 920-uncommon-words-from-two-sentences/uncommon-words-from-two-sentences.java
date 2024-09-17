class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> dict=new HashMap();
        int ind1=0,ind2=0;
        String tot=s1+" "+s2;
        for(int i=0;i<tot.length();i++){
            if(i==tot.length()-1){
                String temp=tot.substring(ind1,i+1);
                ind1=i+1;
                dict.compute(temp, (k,v)->(v==null)?1:v+1);
            }
            else if(tot.charAt(i)==' '){
                String temp=tot.substring(ind1,i);
                ind1=i+1;
                dict.compute(temp, (k,v)->(v==null)?1:v+1);
            }
        }
        int count=0;
        for (Map.Entry<String, Integer> entry : dict.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if(value==1)
            count++;
        }
        String[] a = new String[count];
        int ind=0;
        for(Map.Entry<String,Integer> e:dict.entrySet()){
            String key=e.getKey();
            int val=e.getValue();
            if(val==1){
            a[ind]=key;
            ind++;}
        }
        return a;
    }
}