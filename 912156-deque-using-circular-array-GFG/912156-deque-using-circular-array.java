class myDeque {
    private int[] arr;
    private int front;
    private int size;
    private int capacity;

    public myDeque(int n) {
        this.capacity = n;
        this.arr = new int[n];
        this.front = 0;
        this.size = 0;
    }

    public void insertFront(int x) {
        if (size == capacity) {
            return;
        }
        front = (front - 1 + capacity) % capacity;
        arr[front] = x;
        size++;
    }

    public void insertRear(int x) {
        if (size == capacity) {
            return;
        }
        int rear = (front + size) % capacity;
        arr[rear] = x;
        size++;
    }

    public void deleteFront() {
        if (size == 0) {
            return;
        }
        front = (front + 1) % capacity;
        size--;
    }

    public void deleteRear() {
        if (size == 0) {
            return;
        }
        size--;
    }

    public int frontEle() {
        if (size == 0) {
            return -1;
        }
        return arr[front];
    }

    public int rearEle() {
        if (size == 0) {
            return -1;
        }
        int rear = (front + size - 1) % capacity;
        return arr[rear];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna