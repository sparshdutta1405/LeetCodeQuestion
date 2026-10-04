class Solution {
    public int minRotations(int n, String s) {
        int[] arr = new int[n];

        for(int i = 0; i< n; i++){
            arr[i] = s.charAt(i)-'0';
        }

        int baseCost = dist(0, arr[0]);
        for(int i = 1; i<n;i++){
            baseCost += dist(arr[i-1],arr[i]);
        }

        int minCost = baseCost;

        for(int k = 0;k < n; k++){
            int currentCost;

            if(k==0){
                currentCost = baseCost - dist(0, arr[0]) + dist(0, arr[n-1]);
            }else{
                currentCost = baseCost - dist(arr[k-1], arr[k]) + dist(arr[k-1], arr[n-1]);
            }

            minCost = Math.min(minCost, currentCost);
        }
        return minCost;
        
    }

    private int dist(int a, int b){
        int diff = Math.abs(a-b);
        return Math.min(diff, 10-diff);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna