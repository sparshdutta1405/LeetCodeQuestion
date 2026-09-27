class Solution {
    public int lastStoneWeight(int[] stones) {
        int[] count = new int[1001];
        int maxWeight = 0;

        for(int stone: stones){
            count[stone]++;
            maxWeight = Math.max(maxWeight, stone);
        }

        int currWeight = maxWeight;
        int carry = 0;

        while(currWeight > 0){
            if(count[currWeight] == 0){
                currWeight--;
                continue;
            }

            if(carry == 0){
                count[currWeight] %= 2;

                if(count[currWeight] == 1){
                    carry = currWeight;
                    count[currWeight] = 0;
                }

                currWeight--;
            }else{
                count[currWeight]--;
                int diff = carry - currWeight;
                carry = 0;

                if(diff> 0){
                    count[diff]++;

                    if(diff > currWeight){
                        currWeight = diff;
                    }
                }
            }
        }

        return carry;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna