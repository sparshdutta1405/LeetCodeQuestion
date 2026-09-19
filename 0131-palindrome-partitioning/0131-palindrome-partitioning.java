class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> currentPath = new ArrayList<>();
        backTrack(0, s, currentPath, result);
        return result;
    }

    private void backTrack(int start, String s, List<String> currentPath, List<List<String>> result){
        if(start == s.length()){
            result.add(new ArrayList<>(currentPath));
            return;
        }

        for(int end = start; end < s.length(); end++){
            if(isPalindrome(s, start, end)){
                currentPath.add(s.substring(start, end+1));
                backTrack(end+1, s, currentPath, result);
                currentPath.remove(currentPath.size() -1);
            }
        }
    }

    private boolean isPalindrome(String s, int left, int right){
        while(left<right){
            if(s.charAt(left++) != s.charAt(right--)){
                return false;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna