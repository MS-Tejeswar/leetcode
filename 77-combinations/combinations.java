class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> a=new ArrayList<>();
       // int[] num=new int[n];
        List<Integer> num=new ArrayList<>();
        for(int i=1;i<=n;i++)
        num.add(i);
        ans(a, new ArrayList<>(), k,num,0);
        return a;
    }
    public void ans(List<List<Integer>> a, List<Integer> temp, int k, List<Integer> num,int ind){
       
        
        if(temp.size()==k)
        a.add(new ArrayList<>(temp));

        else{
            for(int i=ind;i<num.size();i++){
                int j=num.get(i);
                temp.add(j);
               // num.remove(i);
                ans(a,temp,k,num,i+1);
                temp.remove(temp.size()-1);
               // num.add(i,j);
            }
        }
    }
}