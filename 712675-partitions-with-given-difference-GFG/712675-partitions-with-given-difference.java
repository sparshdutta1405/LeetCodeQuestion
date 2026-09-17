import java.util.Arrays;

class Solution {
    private static final int MOD = 1_000_000_007;

    public int countPartitions(int[] arr, int diff) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        
        if (totalSum < diff || (totalSum + diff) % 2 != 0) {
            return 0;
        }

        int target = (totalSum + diff) / 2;
        int n = arr.length;

        
        int[][] memo = new int[n][target + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        return solve(n - 1, target, arr, memo);
    }

    private int solve(int i, int s, int[] arr, int[][] memo) {
        // Base case at the first element 
        if (i == 0) {
            if (s == 0 && arr[0] == 0) return 2; 
            if (s == 0 || arr[0] == s) return 1;
            return 0;
        }

        if (memo[i][s] != -1) {
            return memo[i][s];
        }

        //Exclude 
        int notTake = solve(i - 1, s, arr, memo);

        //Include 
        int take = 0;
        if (arr[i] <= s) {
            take = solve(i - 1, s - arr[i], arr, memo);
        }

        return memo[i][s] = (notTake + take) % MOD;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna