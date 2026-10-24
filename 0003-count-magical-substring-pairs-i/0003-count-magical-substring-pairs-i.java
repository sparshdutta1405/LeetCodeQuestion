class Solution {
    public int countMagicalPairs(String s) {
        int n = s.length();
        int totalPairs = 0;

        for(int j = 0; j < n-1; j++){
            int[] leftCounts = new int[27];
            int distinctLeft = 0;
            int[] seenLeft = new int[26];


            for(int i = j; i >= 0; i--){
                int charIdx = s.charAt(i) - 'a';
                if(seenLeft[charIdx] == 0){
                    distinctLeft++;
                }

                seenLeft[charIdx]++;
                leftCounts[distinctLeft]++;
            }

            int distinctRight = 0;
            int[] seenRight = new int[26];

            for(int k = j + 1; k < n; k++){
                int charIdx = s.charAt(k) - 'a';
                if(seenRight[charIdx] == 0){
                    distinctRight++;
                }
                seenRight[charIdx]++;

                totalPairs += leftCounts[distinctRight];
            }
        }
        return totalPairs;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna