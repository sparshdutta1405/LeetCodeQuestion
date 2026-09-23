class Solution {
    public int minOperations(String a, String b) {
        int n = a.length();
        int m = b.length();

        int[][] memo = new int[n + 1][m + 1];

        for (int[] r : memo) {
            Arrays.fill(r, -1);
        }

        int result = fxn(a, b, n, m, memo);

        return (n - result) + (m - result);
    }

    public int fxn(String s1, String s2, int i, int j, int[][] memo) {
        if (i == 0 || j == 0) {
            return 0;
        }

        if (memo[i][j] != -1) {
            return memo[i][j];
        }

        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
            return memo[i][j] = 1 + fxn(s1, s2, i - 1, j - 1, memo);
        } else {
            return memo[i][j] = Math.max(
                fxn(s1, s2, i - 1, j, memo),
                fxn(s1, s2, i, j - 1, memo)
            );
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna