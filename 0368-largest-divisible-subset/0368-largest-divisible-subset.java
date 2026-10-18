class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        if(n == 0) return new ArrayList<>();

        Arrays.sort(nums);

        int[] dp = new int[n];
        int[] parent = new int[n];

        Arrays.fill(dp, 1);
        for(int i = 0; i < n; i++){
            parent[i] = i;
        }


        int maxLen = 1;
        int maxIdx = 0;


        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i]){
                    dp[i] = dp[j] + 1;
                    parent[i] = j;
                }
            }

            if(dp[i] > maxLen){
                maxLen = dp[i];
                maxIdx = i;
            }
        }

        List<Integer> result = new ArrayList<>();
        int curr = maxIdx;
        while(parent[curr] != curr){
            result.add(nums[curr]);
            curr = parent[curr];
        }
        result.add(nums[curr]);
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna