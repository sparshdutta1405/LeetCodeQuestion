class Solution {
    public ArrayList<Integer> fibonacciNumbers(int n) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
        return print(result,0, 1, n);
    }
    
    public ArrayList<Integer> print(ArrayList<Integer> result, int current , int next, int remain ){
        if(remain <= 0)
        return result;
        
        
        result.add(current);
        return print(result ,next ,current + next,remain -1 );
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna