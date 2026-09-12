class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;

        return solve(nums, n);
    }

    private int solve(int[] arr, int n){
        int left = 0;
        int zeroCount = 0;
        int maxLen = 0;

        for(int right = 0; right < n; right++){
            if(arr[right] == 0){
                zeroCount++;
            }

            while(zeroCount > 1){
                if(arr[left] == 0){
                    zeroCount--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left);
        }
        return maxLen;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna