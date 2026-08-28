import java.util.Stack;

class Solution {
    public static boolean pairWiseConsecutive(Stack<Integer> st) {
        // If stack has an odd number of elements, discard top element
        if (st.size() % 2 != 0) {
            st.pop();
        }

        // Check pairs from top to bottom
        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();

            if (Math.abs(a - b) != 1) {
                return false;
            }
        }

        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna