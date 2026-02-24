class Solution {
    public int maximumProduct(int[] nums) {
        int first= Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
     int m1=0;int m2=0;
        for(int n: nums) {
            if(n>third) {
                if(n>first) {
                    third = second;
                    second = first;
                    first = n;
                } else 
                    if(n > second) {
                        third = second;
                        second = n;
                    } else {
                        third = n;
                    }
                
            }
            if(n <m2) {
                if(n <m1) {
                    m2 = m1;
                    m1 = n;
                } else {
                    m2 =n;
                }
            }
        }
        return Math.max(first*second*third, first*m2*m1);
    }
}