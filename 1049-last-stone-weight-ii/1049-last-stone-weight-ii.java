class Solution {
    private int[][] memo;

    public int lastStoneWeightII(int[] stones) {
        int totalSum = 0;

        for(int stone: stones){
            totalSum+= stone;
        }

        int target = totalSum/2;
        int n = stones.length;

        memo = new int[n][target + 1];
        for(int[] row: memo){
            Arrays.fill(row, -1);
        }

        int s1 = solve(n-1, target, stones);
        return totalSum - 2*s1;
    }

    private int solve(int i, int capacity, int[] stones){
        if(i<0||capacity == 0){
            return 0;
        }

        if(memo[i][capacity] != -1){
            return memo[i][capacity];
        }

        int notTake = solve(i-1, capacity, stones);

        int take = 0;
        if(stones[i] <= capacity){
            take = stones[i] + solve(i-1, capacity - stones[i], stones);
        }

        return memo[i][capacity] = Math.max(notTake, take);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna