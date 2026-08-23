class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<s.length();i++){
            int asc = (int)s.charAt(i);

            String bits = Integer.toBinaryString(asc);

            while(bits.length()<8){
                bits = "0" +bits;
            }

            sb.append(bits);

        }

        int left = 0;
        int right = sb.length()-1;

        while(left<right){
            if(sb.charAt(left) != sb.charAt(right)){
                return false;
            }

            left++;
            right--;
        }


        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna