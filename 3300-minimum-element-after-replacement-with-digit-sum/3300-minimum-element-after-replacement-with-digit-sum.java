class Solution {
    public int minElement(int[] nums) {
        int minResult = Integer.MAX_VALUE;

        for (int n: nums){
            int digitSum = 0;
            int temp = n;

            while(temp > 0){
                digitSum += temp % 10;
                temp /= 10;

            }

            if(digitSum < minResult){
                minResult = digitSum;
            }
        }
        return minResult;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna