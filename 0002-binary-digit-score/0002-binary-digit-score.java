class Solution {
    public int calculateScore(int a, int b) {
        int one = Integer.bitCount(a);
        int second = Integer.bitCount(b);

        if(one >= second){
            return one*second;
        }else {
            return second/one;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna