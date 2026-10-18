class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        
        int[] digitSums = new int[n];
        for(int i = 0; i < n ;i++){
            digitSums[i] = getDigitSum(nums[i]);
        }


        Integer[] order = new Integer[n];
        for(int i = 0; i < n; i++){
            order[i] = i;
        }

        Arrays.sort(order, (a, b) -> {
            if (digitSums[a] != digitSums[b]) {
                return Integer.compare(digitSums[a], digitSums[b]);
            }
            return Integer.compare(nums[a], nums[b]);
        });

        int[] targetPos = new int[n];
        for(int targetIdx = 0; targetIdx < n ; targetIdx++){
            targetPos[order[targetIdx]] = targetIdx;
        }

        boolean[] visited = new boolean[n];
        int totalSwaps = 0;

        for(int i = 0; i < n; i++){
            if(visited[i] || targetPos[i] == 1){
                continue;
            }

            int cycleSize = 0;
            int curr = i;
            while(!visited[curr]){
                visited[curr] = true;
                curr = targetPos[curr];
                cycleSize++;
            }

            if(cycleSize > 1){
                totalSwaps += (cycleSize - 1);
            }
        }

        return totalSwaps;

    }

    private int getDigitSum(int val){
        int sum = 0;
        while(val > 0){
            sum += val % 10;
            val /= 10;
        }
        return sum;
    }


}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna