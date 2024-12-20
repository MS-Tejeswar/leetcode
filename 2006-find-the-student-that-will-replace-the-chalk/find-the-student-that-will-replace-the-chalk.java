class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for (int chalkAmount : chalk) {
            sum += chalkAmount;
        }

        k %= sum;  

        for (int i = 0; i < chalk.length; i++) {
            if (k < chalk[i]) {
                return i;
            }
            k -= chalk[i];
        }

        return 0;  
    }
}