# [Pair Sum Count in Two Linked Lists](https://www.geeksforgeeks.org/problems/count-pairs-whose-sum-is-equal-to-x/1)
## Easy
Given two linked lists head1&nbsp;and head2 with distinct elements, determine the count of all distinct pairs from both lists whose sum equals the given value x.
Note: A valid pair would be in the form (x, y) where x is from the first linked list and y is from the second linked list. (1, 3) and (3, 1) are considered different.
Examples:
Input: head1 = 1-&gt;2-&gt;3-&gt;4-&gt;5-&gt;6, head2 = 11-&gt;12-&gt;13, x = 15
Output: 3
Explanation: There are total 3 pairs whose sum is 15 : (4,11) , (3,12) and (2,13)
Input: head1 = 7-&gt;5-&gt;1-&gt;3, head2 = 3-&gt;5-&gt;2-&gt;8, x = 10Output: 2
Explanation: There are total 2 pairs whose sum is 10 : (7,3) and (5,5)
Constraints:1 ≤&nbsp;size of both LinkedList&nbsp;≤ 1061&nbsp;≤&nbsp;node-&gt;data&nbsp;≤ 1091&nbsp;≤&nbsp;x&nbsp;≤&nbsp;109All elements in each linked list are unique.