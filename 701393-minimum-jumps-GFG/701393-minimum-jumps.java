class Solution {
    public int minJumps(int[] arr) {
        // code here
        int n = arr.length;
        
        if(n<= 1)return 0;
        
        if(arr[0] == 0) return -1;
        
        int maxReach = arr[0];
        int currentEnd = arr[0];
        int jumps = 1;
        
        for (int i = 1; i < n; i++) {
            
            if (i == n - 1) {
                return jumps;
            }

            maxReach = Math.max(maxReach, i + arr[i]);

            if (i == currentEnd) {
                jumps++;

                if (i >= maxReach) {
                    return -1;
                }

                currentEnd = maxReach;
            }
        }
        
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna