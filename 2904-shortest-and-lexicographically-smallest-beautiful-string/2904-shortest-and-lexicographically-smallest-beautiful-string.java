class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        int left = 0;
        int onesCount = 0;
        String ans = "";

        for (int right = 0; right < n; right++) {
            if (s.charAt(right) == '1') {
                onesCount++;
            }

            while (onesCount == k) {
                
                while (s.charAt(left) == '0') {
                    left++;
                }

                String candidate = s.substring(left, right + 1);

                
                if (ans.isEmpty() || candidate.length() < ans.length() || 
                   (candidate.length() == ans.length() && candidate.compareTo(ans) < 0)) {
                    ans = candidate;
                }

                
                left++;
                onesCount--;
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna