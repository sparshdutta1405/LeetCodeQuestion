class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        int left = 0;
        
        if(k ==0) return false;

        Set<Integer> wahh = new HashSet<>();
        for(int right = 0; right < nums.length; right++){
            if(right -left > k){
                wahh.remove(nums[left]);
                left++;
            }

            if(wahh.contains(nums[right])) return true;
            wahh.add(nums[right]);
          
        }

        return false;

    }
}