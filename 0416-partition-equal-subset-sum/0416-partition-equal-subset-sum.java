class Solution {
    public boolean canPartition(int[] nums) {
        
        int sum = 0;
        
        for(int n: nums){
            sum += n;
        }

        if(sum %2 != 0){
            return false;
        }

        int target = sum / 2;
        Boolean[][] dp = new Boolean[nums.length][target +1];

        return solve(nums, target, dp, 0);
    }

    private boolean solve(int[] nums, int target, Boolean[][] dp, int index){
        if(target == 0){
            return true;
        }

        if(index >= nums.length || target < 0){
            return false;
        }


        if(dp[index][target] != null){
            return dp[index][target];
        }

        //to include an element of nums arrya
        boolean include = solve(nums, target - nums[index], dp, index+1);
        //to exclude an element of nums array
        boolean exclude = solve(nums, target, dp, index+1);

        dp[index][target] = include || exclude;
        return dp[index][target];

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna