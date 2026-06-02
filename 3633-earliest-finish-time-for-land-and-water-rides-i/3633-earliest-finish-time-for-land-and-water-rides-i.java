class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,int[] waterStartTime, int[] waterDuration) {

        int minLandEnd = Integer.MAX_VALUE;
        int minWaterEnd = Integer.MAX_VALUE;

        for (int i = 0; i < landStartTime.length; i++) {
            minLandEnd = Math.min(minLandEnd,
            landStartTime[i] + landDuration[i]);
        }
        for (int i = 0; i < waterStartTime.length; i++) {
            minWaterEnd = Math.min(minWaterEnd,
            waterStartTime[i] + waterDuration[i]);
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < waterStartTime.length; i++) {
            ans = Math.min(ans,
                           Math.max(minLandEnd, waterStartTime[i])
                           + waterDuration[i]);
        }
        for (int i = 0; i < landStartTime.length; i++) {
            ans = Math.min(ans,
            Math.max(minWaterEnd, landStartTime[i])+ landDuration[i]);
        }
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna