class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);


        while(fast != 1 && slow != fast){
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }

        return fast == 1;
    }


    private int getNext(int n){
        int totalSum = 0;
        while(n>0){
            int d = n % 10;
            totalSum += d*d;
            n/=10;
        }

        return totalSum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna