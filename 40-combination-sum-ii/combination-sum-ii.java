class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates); // Sort the candidates array
        backtrack(ans, new ArrayList<>(), candidates, target, 0);
        return ans;
    }
    
    private void backtrack(List<List<Integer>> ans, List<Integer> temp, int[] candidates, int remain, int start) {
        if (remain == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i-1]) continue; // Skip duplicates
            if (candidates[i] > remain) break; // Stop if candidate is greater than remaining sum
            
            temp.add(candidates[i]);
            backtrack(ans, temp, candidates, remain - candidates[i], i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}