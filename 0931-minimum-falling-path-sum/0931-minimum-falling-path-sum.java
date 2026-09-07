class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int up = matrix[i - 1][j];
                int upLeft = (j > 0) ? matrix[i - 1][j - 1] : Integer.MAX_VALUE;
                int upRight = (j < n - 1) ? matrix[i - 1][j + 1] : Integer.MAX_VALUE;

                matrix[i][j] += Math.min(up, Math.min(upLeft, upRight));
            }
        }

        int minSum = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            minSum = Math.min(minSum, matrix[n - 1][j]);
        }

        return minSum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna