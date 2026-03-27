class Solution {
    public int reverse(int x) {
        long rev = 0;

        while(x != 0){
            int poop = x % 10;
            rev = rev * 10 + poop;
            x /=10; 
        }

        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            return 0;
        }

        return (int) rev;
    }
}



// value of -2^31 = -2147483648
//value of 2^31 = 2147483648 - 1