class Solution {

    private int[][] memo;

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        if(obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1){
            return 0;
        }

        memo = new int [m][n];

        for(int[] row: memo){
            Arrays.fill(row,-1);
        }

        return fxn(0,0, m, n, obstacleGrid);
    }

    private int fxn(int r, int c, int m, int n, int[][] grid){
        if (r >= m || c >= n || grid[r][c] == 1) {
            return 0;
        }

        if (r == m - 1 && c == n - 1) {
            return 1;
        }

        if (memo[r][c] != -1) {
            return memo[r][c];
        }

        int down = fxn(r + 1, c, m, n, grid);
        int right = fxn(r, c + 1, m, n, grid);

        return memo[r][c] = down + right;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna