# [Merge Lists Alternatingly](https://www.geeksforgeeks.org/problems/merge-list-alternatingly/1)
## Easy
Given two linked lists head1 and head2, your task is to complete the function mergeList() which inserts nodes of the second list into the first list at alternate positions of the first list and leaves the remaining nodes as it is if they cannot be inserted.
The function should return an array containing the two modified linked list heads in their original order.
Examples:Input:&nbsp;LinkedList1 = 10-&gt;9 , LinkedList2 = 6-&gt;1-&gt;2-&gt;3-&gt;4-&gt;5Output: LinkedList1 = 10-&gt;6-&gt;9-&gt;1 , LinkedList2 = 2-&gt;3-&gt;4-&gt;5Explanation: The two linked list are 10-&gt;9 and 6-&gt;1-&gt;2-&gt;3-&gt;4-&gt;5. After merging the two lists as required, the new list is like: 10-&gt;6-&gt;9-&gt;1 and  2-&gt;3-&gt;4-&gt;5.
Input: LinkedList1 = 55-&gt;66-&gt;77-&gt;88-&gt;99 , LinkedList2 = 11-&gt;22-&gt;33-&gt;44-&gt;55Output: LinkedList1 = 55-&gt;11-&gt;66-&gt;22-&gt;77-&gt;33-&gt;88-&gt;44-&gt;99-&gt;55 , LinkedList2 = &lt;empty&gt;
Expected Time Complexity:&nbsp;O(n+m)Expected Auxiliary Space:&nbsp;O(1)
Constraints:0 &lt;= number of nodes &lt;= 1001 &lt;= node -&gt; data &lt;= 104