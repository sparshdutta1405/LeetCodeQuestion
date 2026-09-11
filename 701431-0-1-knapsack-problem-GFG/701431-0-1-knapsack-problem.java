class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n=wt.length;
        int [][]dp=new int[n+1][W+1];

        for(int[] row:dp){
            Arrays.fill(row,-1);
        }

        return solve(val,wt,W,n,0,dp);
    }

    public static int solve(int []val,int []wt,int W,int n,int i,int [][]dp){

        if(dp[i][W]!=-1) return dp[i][W];

        if(i>=n){
            return 0;
        }


        int notTake=solve(val,wt,W,n,i+1,dp);

        int take=Integer.MIN_VALUE;
        if(W>=wt[i]){
            int num=val[i]+solve(val,wt,W-wt[i],n,i+1,dp);

            take=Math.max(take,num);
        }
        return dp[i][W]= Math.max(take,notTake);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna