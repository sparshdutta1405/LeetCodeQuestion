class Solution {
    public int peakValleyDifference(int[] nums) {
        int diff = 0;
        int n = nums.length;

        for(int i = 1; i < n-1 ; i++){
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]){
                diff += nums[i];
            }else if(nums[i] < nums[i - 1] && nums[i] < nums[i+1]){
                diff -= nums[i];
            }
        }

        return diff;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna