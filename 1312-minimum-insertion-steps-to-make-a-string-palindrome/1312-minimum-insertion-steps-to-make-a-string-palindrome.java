class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        
        int[][] memo = new int[n][n];

        for(int[] row: memo){
            Arrays.fill(row, -1);
        }


        return fxn(0, n-1, s, memo);
    }

    private int fxn(int i , int j, String s, int[][] memo){
        if(i >= j)
        return 0;

        if(memo[i][j] != -1)
        return memo[i][j];

        if(s.charAt(i) == s.charAt(j)){
            return memo[i][j] = fxn(i+1,j-1, s, memo);
        } else{
            return memo[i][j] = 1+Math.min(fxn(i+1, j, s, memo), fxn(i, j-1, s, memo));
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna