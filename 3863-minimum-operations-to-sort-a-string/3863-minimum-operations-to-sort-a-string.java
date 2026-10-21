class Solution {
    public int minOperations(String s) {
        int n = s.length();

        if(isSorted(s)){
            return 0;
        }

        if(n == 2){
            return -1;
        }


        char[] sArr1 = s.toCharArray();
        Arrays.sort(sArr1, 1, n);
        if(isSorted(new String(sArr1))){
            return 1;
        }

        char[] sArr2 = s.toCharArray();
        Arrays.sort(sArr2, 0, n - 1);
        if (isSorted(new String(sArr2))) {
            return 1;
        }

        char minChar = 'z';
        char maxChar = 'a';
        for(int i = 0; i < n ; i++){
            char c = s.charAt(i);
            if(c < minChar) minChar = c;
            if(c > maxChar) maxChar = c;
        }

        boolean minElsewhere = false;
        for(int i = 0; i < n-1 ; i++){
            if(s.charAt(i) == minChar){
                minElsewhere = true;
                break;
            }
        }

        boolean maxElsewhere = false;
        for( int i = 1; i < n; i++){
            if(s.charAt(i) == maxChar){
                maxElsewhere = true;
                break;
            }
        }

        if (s.charAt(0) == maxChar && s.charAt(n - 1) == minChar && !minElsewhere && !maxElsewhere) {
            return 3;
        }


        return 2;
    }

    private boolean isSorted (String s){
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna