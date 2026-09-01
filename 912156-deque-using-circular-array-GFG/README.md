# [Deque using Circular Array](https://www.geeksforgeeks.org/problems/implementation-of-deque-using-circular-array--174925/1)
## Medium
Implement a&nbsp;Deque (Double Ended Queue) using a circular array, where the size of the array, n&nbsp;is given.The Deque must support the following operations:
(i)&nbsp;insertFront(x):&nbsp;Adds an element x at the front of Deque.(ii)&nbsp;insertRear(x):&nbsp;Adds an element x at the rear of Deque.(iii)&nbsp;deleteFront():&nbsp;Deletes an element from front of Deque.&nbsp;(iv)&nbsp;deleteRear():&nbsp;Deletes an element from rear of Deque.(v)&nbsp;frontEle():&nbsp;Gets the front element from queue. Return -1 if it is empty.(vi)&nbsp;rearEle():&nbsp;Gets the last element from queue. Return -1 if it is empty.
There will be a sequence of queries&nbsp;queries[][]. The queries are represented in numeric form:

1 x : Call insertFront(x)
2 x : Call insertRear(x)
3 : Call deleteFront()
4 : Call deleteRear()
5 : Call frontEle()
6 : Call rearEle()

You just have to implement the functions&nbsp;insertFront,&nbsp;insertRear,&nbsp;deleteFront, deleteRear,&nbsp;frontEle and&nbsp;rearEle and the driver code will handle the input &amp; output.
Note: It is guaranteed that all the queries are valid.
Examples:
Input: n = 3, q = 6, queries[][] = [[1, 3], [2, 5], [1, 6], [6], [3], [5]]
Output: [5, 3]
Explanation: Queries on Deque are as follows:insertFront(3): Insert 3 at the front of the Deque.insertRear(5): Insert 5 at the rear of the Deque.insertFront(6): Insert 6 at the front of the Deque.rearEle(): Return the rear element i.e 5.deleteFront(): Remove the front element 6 from the Deque.frontEle(): Return the front element i.e 3.
Input: n = 2, q = 4, queries[][] = [[2, 4], [3], [6], [5]]
Output: [-1, -1]
Explanation: Queries on Deque are as follows:insertRear(4): Insert 4 at the rear of the Deque.deleteFront(): Remove the front element 4 from the Deque.rearEle(): As the Deque is empty return -1.frontEle(): As the Deque is empty return -1.
Constraints:1&nbsp;≤ n ≤ 1031 ≤ number of query ≤ 1030 ≤ x&nbsp;≤ 105