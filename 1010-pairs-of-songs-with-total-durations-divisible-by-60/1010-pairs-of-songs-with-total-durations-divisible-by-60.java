class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int n = time.length;
        int pairs = 0;
        int [] remainders = new int[60];

        for(int t : time){
            int rem = t%60;

            int target = (60 - rem) % 60;

            pairs += remainders[target];
            remainders[rem]++;
        }

        return pairs;
    }
}