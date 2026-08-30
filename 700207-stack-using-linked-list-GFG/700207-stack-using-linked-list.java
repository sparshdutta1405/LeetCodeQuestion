/* Structure of linked list Node
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}*/


class myStack {
    Node top;
    int count;

    public myStack() {
        this.top = null;
        this.count = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int x) {
        Node node = new Node(x); // Fixed: changed 'data' to 'x'
        node.next = top;
        top = node;
        count++;
    }

    public int pop() { // Fixed: return type changed from void to int
        if (isEmpty()) {
            return -1; // Fixed: removed print and replaced null with -1
        }
        int poppedValue = top.data;
        top = top.next;
        count--;
        return poppedValue;
    }

    public int peek() {
        if (isEmpty()) {
            return -1; // Fixed: removed print statement
        }
        return top.data;
    }

    public int size() {
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna