class Solution {
    public int minDeletions(int[] arr) {
        // code here
        int n = arr.length;
        
        ArrayList<Integer> lis = new ArrayList<>();
        
        for(int i = 0; i <= n-1; i++){
            if(lis.isEmpty()  || arr[i] > lis.getLast()){
                lis.add(arr[i]);
            }else{
                int lowerBound = findLowerBound(lis,arr[i]);
                lis.set(lowerBound, arr[i]);
            }
        }
        
        return n - lis.size();
        
    }
    
    private int findLowerBound(List<Integer> lis, int lowerBound ){
        int left = 0;
        int right = lis.size() -1;
        
        while(left<right){
            int mid = left+(right-left)/2;
            if(lis.get(mid) < lowerBound){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        
        return left;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna