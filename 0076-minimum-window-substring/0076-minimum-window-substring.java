class Solution {
    public String minWindow(String s, String t) {
        if(s == null || t == null || s.length() < t.length()){
            return "";
        }

        int [] map = new int[128];
        int requiredCount = 0;

        for(char c : t.toCharArray()){
            if(map[c] == 0){
                requiredCount++;
            }

            map[c]++;
        }

        int left = 0, right = 0;
        int formedCount = 0;
        
        int minLen = Integer.MAX_VALUE;
        int minLeft = 0;

        while( right < s.length()){
            char rightChar = s.charAt(right);

            map[rightChar]--;
            if(map[rightChar] == 0){
                formedCount++;
            }

            while(formedCount == requiredCount){
                if(right - left + 1 < minLen){
                    minLen = right - left + 1;
                    minLeft = left;
                }

                char leftChar = s.charAt(left);
                map[leftChar]++;

                if(map[leftChar] >0){
                    formedCount--;
                }

                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLen);
    }

}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna