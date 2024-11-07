
class Solution {
    public int largestCombination(int[] candidates) {
        int maxCount = 0;

        for (int bit = 0; bit < 32; bit++) {
            int count = 0;
            for (int candidate : candidates) {
                if ((candidate & (1 << bit)) != 0) {
                    count++;
                }
            }
            
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}

