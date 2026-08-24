class Solution {
    public String countAndSay(int n) {
        String s = "1";

        for(int i = 2; i<= n; i++){
            StringBuilder sb = new StringBuilder();
            int count = 1;

            for(int j = 0; j < s.length(); j++){
                if (j + 1 < s.length() && s.charAt(j) == s.charAt(j + 1)) {
                    count++;
                } else {
                    sb.append(count).append(s.charAt(j));
                    count = 1; 
                }

            }
            s = sb.toString();
        }
        return s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna