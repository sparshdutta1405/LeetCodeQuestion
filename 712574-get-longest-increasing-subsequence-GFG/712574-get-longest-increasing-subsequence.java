class Solution {
    public ArrayList<Integer> getLIS(int arr[]) {
        // Code here
        int n = arr.length;
        
        if(n==0) 
        return new ArrayList<>();
        
        int[] dp = new int[n];
        int[] parent = new int[n];
        
        Arrays.fill(dp, 1);
        
        for(int i = 0; i < n ;i++){
            parent[i] = i;
        }
        
        
        int maxLen = 0;
        int maxIdx = 0;
        
        for(int i = 0; i < n;i++){
            for(int j = 0; j < i ; j++){
                if(arr[j] < arr[i]  &&  dp[j] + 1 > dp[i]){
                    dp[i] = dp[j] + 1;
                    parent[i]= j;
                }
            }
            
            if(dp[i] > maxLen){
                maxLen = dp[i];
                maxIdx = i;
            }
        }
        
        ArrayList<Integer> lis = new ArrayList<>();
        
        int curr = maxIdx;
        while(parent[curr] != curr){
            lis.add(arr[curr]);
            curr = parent[curr];
        }
        
        lis.add(arr[curr]);
        
        Collections.reverse(lis);
        return lis;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna