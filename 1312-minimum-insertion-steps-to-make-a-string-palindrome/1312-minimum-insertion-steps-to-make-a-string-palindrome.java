class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        String rev = new StringBuilder(s).reverse().toString();
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            int prev = 0;
            for (int j = 1; j <= n; j++) {
                int temp = dp[j];
                if (s.charAt(i - 1) == rev.charAt(j - 1)) {
                    dp[j] = 1 + prev;
                } else {
                    dp[j] = Math.max(dp[j], dp[j - 1]);
                }
                prev = temp;
            }
        }

        int lps = dp[n];
        return n - lps;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna