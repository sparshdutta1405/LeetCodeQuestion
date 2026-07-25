class Solution {
    public int maxProduct(int n) {
        int m1 = 0;
        int m2 = 1;

        while(n>0){
            int digi = n%10;

            if(digi>m1){
                m2 = m1;
                m1 = digi;
            }else if(digi > m2){
                m2 = digi;
            }
            n/=10;
        }
        return m1 * m2;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna