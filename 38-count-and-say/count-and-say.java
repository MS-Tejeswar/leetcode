class Solution {
    public String countAndSay(int n) {
        String res="1";
        for(int i=1;i<n;i++){
            int count=1;
            String newe="";
            for(int j=1;j<res.length();j++){
                if(res.charAt(j)==(res.charAt(j-1)))
                count+=1;
                else{
                    
                    newe=newe+String.valueOf(count)+res.charAt(j-1);
                 //   System.out.println("neww:"+newe);
                    count=1;
                }
            }
            res=newe+String.valueOf(count)+res.charAt(res.length()-1);
           // System.out.println(res);
        }
        
        return res;
    }
}