class Solution {
    public List<List<Integer>> permute(int[] nums) {
    List<Integer> num=new ArrayList<>();
    for(int i=0;i<nums.length;i++)
    num.add(nums[i]);
    List<List<Integer>> ans=new ArrayList<>();
    recur(ans,new ArrayList<>(), num);
    return ans;
        
    }
    public void recur(List<List<Integer>> ans, List<Integer> temp, List<Integer> num){
        if(num.size()==0)
        ans.add(new ArrayList<>(temp));

        else{
            for(int i=0;i<num.size();i++){
                int g=num.get(i);
                temp.add(g);
                num.remove(i);
                recur(ans,temp,num);
                temp.remove(temp.size()-1);
                num.add(i,g);
            }
        }
    
    }
}