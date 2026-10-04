class Solution {
    public int minRotations(String s) {
        int totalRotation = 0;
        int index = 0;

        for(int i = 0; i < s.length(); i++){
            int target = s.charAt(i) - '0';
            int difference = Math.abs(target - index);
            totalRotation += Math.min(difference, 10-difference);
            index = target;
        }

        return totalRotation;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna