# [Stack Operations](https://www.geeksforgeeks.org/problems/stacks-operations/1)
## Easy
Implement a class&nbsp;myStack&nbsp;that supports following operations:
void push(int x):&nbsp;Insert an element x at the top of the stack.void pop():&nbsp;Remove the element from the top of the stack.int peek():&nbsp;Return the element currently at the top of the stack.bool isEmpty():&nbsp;Return true if the stack is empty, otherwise false.int getSize():&nbsp;Return the number of elements currently in the stack.
There will be a sequence of&nbsp;q queries arr[]. The queries are represented in numeric form:

1 x - Call push(x)
2 - Call pop()
3 - Call peek()
4 - Call isEmpty()
5 - Call getSize()

The driver code will process the queries, call the corresponding functions, and print the outputs of peek(), isEmpty(), getSize() operations.You only need to implement the above five functions.
Examples:
Input: arr[] = [[1 10], [1 30], [3], [5], [2], [4]]Output: [30, 2, false]Explanation: Queries will process as follows:push(10) into the stack.push(30) into the stack.Return top of the stack, i.e. 30.Return current size of the stack, i.e. 2.Remove the element from the top of the stackStack is non-empty, i.e. return false.
Input: arr[] = [[1 5], [3], [2], [4]]Output: [5, true]Explanation: Queries will process as follows: push(5) into the stack.Return top of the stack, i.e. 5.Remove the element from the top of the stack.Stack is Empty, i.e. return true.
Constraints:1&nbsp;≤ q&nbsp;≤ 1001&nbsp;≤ x&nbsp;≤ 100