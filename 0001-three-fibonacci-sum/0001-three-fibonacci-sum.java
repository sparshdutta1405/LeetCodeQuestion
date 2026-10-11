class Solution {
    public boolean threeFibonacciSum(int n) {
        long a = 0;
        long b = 1;
        long c = 1;


        while(true){
            long sum = a+b+c;

            if( sum == n)
            return true;

            if(sum > n)
            return false;

            long next= b+ c;

            a = b;
            b = c;
            c = next;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna