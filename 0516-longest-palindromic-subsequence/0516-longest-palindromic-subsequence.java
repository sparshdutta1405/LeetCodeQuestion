class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] memo = new int[n][n];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return solve(0, n - 1, s, memo);
    }

    private int solve(int i, int j, String s, int[][] memo) {
        if (i > j) {
            return 0;
        }
        if (i == j) {
            return 1;
        }

        if (memo[i][j] != -1) {
            return memo[i][j];
        }

        if (s.charAt(i) == s.charAt(j)) {
            return memo[i][j] = 2 + solve(i + 1, j - 1, s, memo);
        } else {
            return memo[i][j] = Math.max(solve(i + 1, j, s, memo), solve(i, j - 1, s, memo));
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna