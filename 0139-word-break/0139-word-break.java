class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);

        int[] memo = new int[s.length()];
        Arrays.fill(memo, -1);
        return solve(0, s, dict, memo);
    }

    private boolean solve(int start, String s, Set<String> dict, int[] memo){
        if(start == s.length()){
            return true;
        }

        if(memo[start] != -1){
            return memo[start] == 1;
        }

        for(int end  = start + 1; end <= s.length(); end++){
            if(dict.contains(s.substring(start, end)) && solve(end, s, dict, memo)){
                memo[start] = 1;
                return true;
            }
        }

        memo[start] = 0;
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna