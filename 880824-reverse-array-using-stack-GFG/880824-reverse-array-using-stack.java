class Solution {
    public void reverseArray(int[] arr) {
        // code here
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        // Push all elements onto the stack
        for (int i = 0; i < n; i++) {
            st.push(arr[i]);
        }

        // Pop elements back into the array
        for (int i = 0; i < n; i++) {
            arr[i] = st.pop();
        }
        
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna