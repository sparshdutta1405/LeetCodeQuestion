class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int X = nums[0];
        int temp = 0;
        if(n == 0){
            return 0;

        }else{
            for(int i = 0; i < n; i++){
                if(X < nums[i]){
                    X = nums[i];
                }
            }

            for(int j = 0; j < n ; j++){
                if(nums[j] == X)
                temp = j;
            }
        }
        return temp;
    }
}