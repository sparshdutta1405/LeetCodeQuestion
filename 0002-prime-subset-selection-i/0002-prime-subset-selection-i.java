class Solution {
    public List<Integer> maxPrimes(int n, int s) {
        List<Integer> result = new ArrayList<>();

        if(n < 2 || s < 2){
            return result;
        }

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int p = 2; p*p <= n; p++){
            if(isPrime[p]){
                for(int multiple = p * p; multiple <= n; multiple += p){
                    isPrime[multiple] = false;
                }
            }
        }

        for(int p = 2; p <= n; p++){
            if(isPrime[p]){
                if(s>=p){
                    result.add(p);
                    s-=p;
                }else{
                    break;
                }
            }
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna