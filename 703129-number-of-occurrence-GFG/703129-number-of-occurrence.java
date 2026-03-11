class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int n = arr.length;
        int low = 0;
        int high = arr.length-1;
        int mid = low+(high - low)/2;

        int last = 0;
        
        int first = -1;
        while(low <= high){
            mid = low+(high - low)/2;
            
            if(arr[mid] == target){
                first = mid;
                high = mid-1;
            }else if(arr[mid]  > target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        
        if(first == -1) return 0;
        
        
        mid = low+(high - low)/2;
        low = 0;
        high = arr.length-1;
        while(low <= high){
            mid = low+(high - low)/2;
            
            if(arr[mid] == target){
                last = mid;
                low = low+1;
            }else if(arr[mid] > target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        
        //System.out.println(first);
        //System.out.println(last);
        return last - first +1;
        
    }
}
