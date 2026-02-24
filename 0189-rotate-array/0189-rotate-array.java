class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        rev(nums , 0 , nums.length-1);
        rev(nums , 0 , k-1);
        rev(nums , k , nums.length-1);
    }


    public void rev (int[] arr , int i , int j){
        int temp = 0;
        while(i < j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}