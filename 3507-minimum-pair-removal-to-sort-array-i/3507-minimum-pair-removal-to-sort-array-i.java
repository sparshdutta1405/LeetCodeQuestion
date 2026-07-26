class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num: nums){
            list.add(num);
        }

        int operations = 0;
        
        while(!isSorted(list)){
            int minSum = Integer.MAX_VALUE;
            int minIndex = -1;

            for(int i = 0; i < list.size() - 1; i++){
                int pairSum = list.get(i) + list.get(i+1);
                if(pairSum < minSum){
                    minSum = pairSum;
                    minIndex = i;
                }
            }

            list.set(minIndex, minSum);
            list.remove(minIndex + 1);

            operations++;
        }
        return operations;
    }


    private boolean isSorted(List<Integer> list){
        for(int i = 1; i < list.size(); i++){
            if(list.get(i) < list.get(i-1)){
                return false;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna