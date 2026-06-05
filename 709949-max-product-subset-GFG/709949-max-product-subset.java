class Solution {
    public int findMaxProduct(int[] arr) {
        // code here
        int n = arr.length;
        
        if(n == 1){
            return arr[0];
        }
        
        long mod = 1000000007;
        long product = 1;
        
        int countNeg = 0;
        int countZero = 0;
        int countPos = 0;
        int maxNegative = Integer.MIN_VALUE;
        
        for(int i = 0; i < n ; i++){
            if(arr[i] == 0){
                countZero++;
                continue;
            }
            
            if(arr[i] < 0){
                countNeg++;
                maxNegative = Math.max(maxNegative, arr[i]);
            }else{
                countPos++;
            }
        }
        
        if(countZero == n || (countNeg == 1 && countZero + countNeg == n)){
            return 0;
        }
        
        int skipped = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) continue;
            if (countNeg % 2 != 0 && arr[i] == maxNegative && skipped == 0) {
                skipped = 1;
                continue;
            }
            product = (product * arr[i]) % mod;
        }
        
        if(product < 0){
            product = (product + mod)%mod;
        }
        
        
        return(int) product;
        
        
        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna