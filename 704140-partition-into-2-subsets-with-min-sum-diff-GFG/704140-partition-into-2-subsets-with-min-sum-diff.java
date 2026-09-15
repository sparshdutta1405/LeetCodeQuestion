class Solution {
    public int minDifference(int arr[]) {
        // code here
        int totalSum = 0;
        
        for(int num: arr){
            totalSum += num;
        }
        
        int n = arr.length;
        
        Integer[][] dp = new Integer[n][totalSum+1];
        
        return fxn(arr, 0, 0, totalSum, dp);
    }
    
    private int fxn(int[] arr, int index, int sum1 , int totalSum, Integer[][] dp){
        
        
        if(index == arr.length){
            int sum2 = totalSum - sum1;
            return Math.abs(sum1 - sum2);
        }
        
        if(dp[index][sum1] != null){
            return dp[index][sum1];
        }
        
        
        //This is for the case where we include the value 
        int take = fxn(arr, index + 1, sum1 + arr[index], totalSum, dp);
        
        //This is for the case where we exclude the value
        int skip = fxn(arr, index + 1, sum1, totalSum, dp);
        
        dp[index][sum1] = Math.min(take, skip);
        
        return dp[index][sum1];
        
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna