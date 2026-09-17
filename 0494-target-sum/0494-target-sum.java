class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int totalSum = 0;

        for(int num: nums)
        totalSum += num;

        if(totalSum < Math.abs(target) || (totalSum + target) %2 != 0){
            return 0;
        }

        int s1 = (totalSum + target) / 2;
        int[] dp = new int [s1 + 1];
        dp[0] = 1;

        for(int num: nums){
            for(int s = s1; s >= num; s--){
                dp[s] += dp[s - num];
            }
        }

        return dp[s1];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna