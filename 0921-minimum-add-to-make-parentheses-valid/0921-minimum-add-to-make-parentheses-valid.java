class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int add = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                open++;
            } else {
                if (open > 0) {
                    open--; 
                } else {
                    add++;  
                }
            }
        }

        return add + open;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna