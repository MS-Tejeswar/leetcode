class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> ans=new ArrayList<>();
    recur(ans, new ArrayList<>(), candidates,target,0);
    return ans;
    }
    public void recur(List<List<Integer>> ans, List<Integer> temp, int[] candidates, int remain, int start){
        if(remain<0)
        return;
        else if(remain==0)
        ans.add(new ArrayList<>(temp));
        else{
            for(int i=start;i<candidates.length;i++){
                temp.add(candidates[i]);
                recur(ans,temp,candidates,remain-candidates[i],i);
                temp.remove(temp.size()-1);
            }
        }
    }
}