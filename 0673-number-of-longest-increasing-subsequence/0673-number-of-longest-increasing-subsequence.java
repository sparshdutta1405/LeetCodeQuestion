class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;

        if(n <= 1)
        return n;

        int[] length = new int[n];
        int[] count = new int[n];

        Arrays.fill(length, 1);
        Arrays.fill(count, 1);

        int maxLen = 1;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    if(length[j] + 1 > length[i]){
                        length[i] = length[j] + 1;
                        count[i] = count[j];
                    }else if(length[j] + 1 == length[i]){
                        count[i] += count[j];
                    }
                }
            }
            maxLen = Math.max(maxLen, length[i]);
        }


        int totalWays = 0;
        for(int i = 0 ;i < n; i++){
            if(length[i] == maxLen){
                totalWays += count[i];
            }
        }

        return totalWays;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna