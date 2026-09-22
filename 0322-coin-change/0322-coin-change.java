class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount <1)
        return 0;

        return fxn(coins, amount, new int[amount]);
    }

    private int fxn(int[] coins, int rem, int[] memo){
        if(rem<0) return -1;
        if(rem == 0) return 0;

        if(memo[rem-1] !=0){
            return memo[rem-1];
        }

        int min = Integer.MAX_VALUE;
        for(int coin: coins){
            int res = fxn(coins, rem-coin, memo );
            if(res>=0 && res<min){
                    min = 1 + res;
            }
            
        }

        memo[rem-1] = (min == Integer.MAX_VALUE)? -1:min;
        return memo[rem-1];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna