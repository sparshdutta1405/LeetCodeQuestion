class MyHashMap {
    List<int[]> list;

    public MyHashMap() {
        list = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        for(int[] pair : list){
            if(pair[0] == key){
                pair[1] = value;
                return;
            }
        }
        list.add(new int[]{key,value});
    }
    
    public int get(int key) {
        for(int[] pair: list){
            if(pair[0] == key){
                return pair[1];
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        for(int i = 0; i < list.size();i++){
            if(list.get(i)[0] == key){
                list.remove(i);
                return;
            }
        }
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna