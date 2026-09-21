class Solution {
    public int cutRod(int[] price) {
        // code here
        int n=price.length;

        if(n==1){
            return price[0];
        }

        int[][] dp=new int[n+1][n+1];

        for(int i=0;i<=n;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<=n;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int exclude=dp[i-1][j];

                int include=Integer.MIN_VALUE;

                if(j>=i){
                    include=price[i-1]+dp[i][j-i];
                }

                dp[i][j]=Math.max(exclude,include);
            }
        }
        return dp[n][n];

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna