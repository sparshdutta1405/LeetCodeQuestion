

class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 1){
            return "";
        }
        int start = 0;
        int maxLen = 0;

        for(int i = 0; i < s.length(); i++){
            int len1 = expandAroundCentre(s,i, i);

            int len2 = expandAroundCentre(s, i ,i+1);

            int len = Math.max(len1,len2);

            if(len>maxLen){
                maxLen=len;
                start = i-(len-1)/2;
            }


        }

        return s.substring(start, start+maxLen);
    }


    private int expandAroundCentre(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        } 
        return right-left-1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna