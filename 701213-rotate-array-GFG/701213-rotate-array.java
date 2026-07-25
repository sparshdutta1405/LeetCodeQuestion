class Solution {
    public void rotateArr(int arr[], int d) {
        // code here
        int n = arr.length;
        if(n==0){
            return ;
        }
        
        
        d = d% n;
        if(d == 0)
        return;
        
        reverse(arr, 0,d-1);
        
        reverse(arr, d , n-1);
        
        reverse(arr,0, n-1);
    }
    
    
    private static void reverse(int[] arr, int start, int end){
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    } 
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna