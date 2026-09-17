class Solution {
    private int[][][] memo;

    public int findMaxForm(String[] strs, int m, int n) {
        int len = strs.length;
        memo = new int[len][m + 1][n + 1];
        
        for (int[][] matrix : memo) {
            for (int[] row : matrix) {
                Arrays.fill(row, -1);
            }
        }

        
        int[][] counts = new int[len][2];
        for (int i = 0; i < len; i++) {
            for (char ch : strs[i].toCharArray()) {
                if (ch == '0') counts[i][0]++;
                else counts[i][1]++;
            }
        }

        return fxn(len - 1, m, n, counts);
    }

    private int fxn(int i, int z, int o, int[][] counts ){
        if(i < 0 || (z == 0 && o == 0)){
            return 0;
        }

        if(memo[i][z][o] != -1){
            return memo[i][z][o];
        }


        int exclude = fxn(i-1, z, o, counts);

        int include = 0;
        int zeros = counts[i][0];
        int ones = counts[i][1];
        if(z >= zeros && o >= ones){
            include = 1 + fxn(i - 1, z - zeros, o - ones, counts);
        }

        return memo[i][z][o] = Math.max(exclude, include);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna