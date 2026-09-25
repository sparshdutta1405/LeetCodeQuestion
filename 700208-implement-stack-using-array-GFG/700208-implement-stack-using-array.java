class myStack {
    
    private int[] arr;
    private int top;
    private int capacity;

    public myStack(int n) {
        // Define Data Structures
        capacity = n;
        arr= new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return top == -1;
        
    }

    public boolean isFull() {
        // check if the stack is full
        return top == capacity -1;
    }

    public void push(int x) {
        // Inserts x at the top of the stack
        if(isFull())
            return;
            
        arr[++top] = x;
    }

    public void pop() {
        // Removes an element from the top of the stack
        if(isEmpty())
            return ;
            
        top--;
    }

    public int peek() {
        // Returns the top element of the stack
        
        if(isEmpty())
            return -1;
            
        return arr[top];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna