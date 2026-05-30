class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here
        if (s.isEmpty()) return;
        
        // Define and initialize the size manually
        int sizeOfStack = s.size(); 
        int targetFromTop = sizeOfStack / 2;
        
        List<Integer> temp = new ArrayList<>(targetFromTop);
        
        for (int i = 0; i < targetFromTop; i++) {
            temp.add(s.pop());
        }
        
        s.pop();
        
        for (int i = targetFromTop - 1; i >= 0; i--) {
            s.push(temp.get(i));
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna