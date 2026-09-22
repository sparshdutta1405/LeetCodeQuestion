class Solution {
    public int change(int amount, int[] coins) {
        
        if(amount==0) return 1;

        int n=coins.length;

        int[][] dp=new int[n+1][amount+1];

        for(int i=0;i<=n;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<=amount;i++){
            dp[0][i]=0;
        }
        dp[0][0]=1;

        for(int i=1;i<=n;i++){
            for(int j=0;j<=amount;j++){
                int exclude=dp[i-1][j];

                int include=0;
                if(j>=coins[i-1]){
                    include=dp[i][j-coins[i-1]];
                }
                dp[i][j]=include+exclude;
            }
        }
        return dp[n][amount];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna