class Solution {
    public long maximizeSum(int[] nums, int k) {
        int n = nums.length;
        long totalSum = 0;
        long[] gains = new long[n];

        for(int i = 0; i < n; i++){
            totalSum += nums[i];
            long maxVal = getMaxRearranged(nums[i]);
            gains[i] = maxVal - nums[i];
        }

        Arrays.sort(gains);

        int count = 0;
         for(int i = n -1; i >= 0 && count < k ;i--){
             if(gains[i] > 0){
                 totalSum += gains[i];
                 count++;
            }else {
                 break;
            }
        }

        return totalSum;
    }

    private long getMaxRearranged(int val){
        int[] digitCounts = new int [10];
        int temp = val;
        while(temp > 0){
            digitCounts[temp % 10]++;
            temp /= 10;
        }

        long result = 0;
        for(int i = 9; i >= 0; i--){
            while(digitCounts[i] > 0){
                result = result * 10 + i;
                digitCounts[i]--;
            }
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna