class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int lessThan = 0;
        int targetCount = 0;
        
        for(int num: nums){
            if(num < target){
                lessThan++;
            }else if (num == target){
                targetCount++;
            }
        }

        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < targetCount; i++){
            result.add(lessThan + i);
        }


        return result;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna