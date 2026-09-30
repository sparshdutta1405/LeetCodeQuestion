class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;

        int[][] memo = new int[n+1][n+1];

        for(int[] row: memo){
            Arrays.fill(row, -1);
        }

        return fxn(0, -1, nums, memo);
    }

    private int fxn(int index, int prevIndex, int[] nums, int[][] memo){
        if(index == nums.length){
            return 0;
        }

        if(memo[index][prevIndex + 1] != -1){
            return memo[index][prevIndex + 1];
        }

        int skip = fxn(index + 1, prevIndex, nums, memo);

        int take = 0;
        if(prevIndex == -1 || nums[index] > nums[prevIndex]){
            take = 1 + fxn(index + 1,index, nums, memo );
        }

        return memo[index][prevIndex + 1] = Math.max(take, skip);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna