# [Remove duplicates from a linked list](https://www.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1?page=3&category=Linked%20List&sortBy=difficulty)
## Easy
Given an unsorted linked list. The task is to remove duplicate elements from this unsorted Linked List. When a value appears in multiple nodes, the node which appeared first should be kept, all other duplicates are to be removed.
Examples:
Input: LinkedList: 5-&gt;2-&gt;2-&gt;4
Output: 5-&gt;2-&gt;4
Explanation: Given linked list elements are 5-&gt;2-&gt;2-&gt;4, in which 2 is repeated only. So, we will delete the extra repeated elements 2 from the linked list and the resultant linked list will contain 5-&gt;2-&gt;4 
Input: LinkedList: 2-&gt;2-&gt;2-&gt;2-&gt;2
Output: 2
Explanation:Given linked list elements are 2-&gt;2-&gt;2-&gt;2-&gt;2, in which 2 is repeated. So, we will delete the extra repeated elements 2 from the linked list and the resultant linked list will contain only 2.
Expected Time Complexity: O(n)Expected Space&nbsp;Complexity: O(n)
Constraints:1 &lt;= number of nodes &lt;= 1060 &lt;= node-&gt;data &lt;= 106