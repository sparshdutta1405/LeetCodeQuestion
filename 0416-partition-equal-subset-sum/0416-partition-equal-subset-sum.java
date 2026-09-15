class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;

        for(int num : nums){
            sum += num;
        }

        if(sum % 2 != 0){
            return false;
        }

        int target = sum / 2;
        int n = nums.length;

        boolean[][] dp = new boolean[n+1][target +1];

        dp[0][0] = true;

        for(int i = 1; i <= n ; i++){
            int num = nums[i-1];
            for(int j = 0; j <= target; j++){
                dp[i][j] = dp [i-1][j];

                if(num <= j){
                    dp[i][j] = dp[i][j] || dp[i-1][j-num];
                }
            }
        }

        return dp[n][target];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna