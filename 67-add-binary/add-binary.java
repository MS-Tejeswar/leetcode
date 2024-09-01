class Solution {
    public String rev(String t){
        String c="";
        for(int i=0;i<t.length();i++){
            c=t.charAt(i)+c;
        }
        return c;
    }
    public String addBinary(String a, String b) {
        int a_len=a.length();
        int b_len=b.length();
        String new_a=rev(a);
        String new_b=rev(b);
        int carry=0;
        String finale="";
        int curr_a,curr_b;
        if(a_len>=b_len){
            for(int i=0;i<a_len;i++){
                System.out.println(finale);
                curr_a=Integer.parseInt(Character.toString(new_a.charAt(i)));
                if(i>=b_len){
                curr_b=0;
                }else{
                curr_b=Integer.parseInt(Character.toString(new_b.charAt(i)));}
                int sum=curr_a+curr_b+carry;


                switch(sum){
                    case 3:
                    carry=1;
                    finale+="1";
                    break;

                    case 2:
                    carry=1;
                    finale+="0";
                    break;

                    case 1:
                    carry=0;
                    finale+="1";
                    break;

                    case 0:
                    carry=0;
                    finale+="0";
                    break;

                }
            }
        }
        else{
            for(int i=0;i<b_len;i++){
                System.out.println(finale);
                curr_b=Integer.parseInt(Character.toString(new_b.charAt(i)));
                if(i>=a_len){
                curr_a=0;
                }else{
                curr_a=Integer.parseInt(Character.toString(new_a.charAt(i)));}
                int sum=curr_a+curr_b+carry;


                switch(sum){
                    case 3:
                    carry=1;
                    finale+="1";
                    break;

                    case 2:
                    carry=1;
                    finale+="0";
                    break;

                    case 1:
                    carry=0;
                    finale+="1";
                    break;

                    case 0:
                    carry=0;
                    finale+="0";
                    break;

                }
            }
        }
        if(carry==1)
        return rev(finale+"1");
        return rev(finale);
        
    }
}