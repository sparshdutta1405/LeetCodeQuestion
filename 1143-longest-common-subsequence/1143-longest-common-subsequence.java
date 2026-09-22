class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        int [][]dp=new int[n+1][m+1];
        for(int [] rows:dp){
            Arrays.fill(rows,-1);
        }
        
        return solve(text1, text2, n - 1, m - 1,dp);
    }

    private int solve(String t1, String t2, int i, int j,int [][]dp) {
        if (i < 0 || j < 0) {
            return 0;
        }
        
        if(dp[i][j]!=-1) return dp[i][j];

        if (t1.charAt(i) == t2.charAt(j)) {
            return dp[i][j]=1 + solve(t1, t2, i - 1, j - 1,dp);
        } 
        else {
            return dp[i][j]=Math.max(solve(t1, t2, i, j - 1,dp), solve(t1, t2, i - 1, j,dp));
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna