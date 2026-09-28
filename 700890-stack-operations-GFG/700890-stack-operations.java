class myStack {
    // Define your stack
    private List<Integer> list;
    
    public myStack(){
        list = new ArrayList<>();
    }

    public void push(int x) {
        // insert x into stack
        list.add(x);
    }

    public void pop() {
        // remove top ele from stack
        if(!isEmpty()){
            list.remove(list.size()-1);
        }
    }

    public int peek() {
        // return top of stack
        if(list.isEmpty()){
            return -1;
        }
        
        return list.get(list.size() - 1);
    }

    public int getSize() {
        // return current size of stack
        return list.size();
    }

    public boolean isEmpty() {
        // check whether stack is empty
        
        return list.isEmpty();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna