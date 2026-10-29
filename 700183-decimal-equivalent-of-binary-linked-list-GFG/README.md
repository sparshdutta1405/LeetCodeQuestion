# [Decimal Equivalent of Binary Linked List](https://www.geeksforgeeks.org/problems/decimal-equivalent-of-binary-linked-list/1)
## Easy
You are given a singly linked list where each node contains either 0 or 1. The linked list represents a binary number, where the head node is the most significant bit (MSB).&nbsp;
Convert this binary number into its decimal equivalent. If the linked list is empty, it represents the number 0.
Since the result can be very large, return the answer modulo 109+7.
Examples:
Input: LinkedList: 1 -&gt; 1 -&gt; 1 -&gt; 0 &nbsp;  Output: 14Explanation: 1*23&nbsp;+ 1*22&nbsp;+&nbsp;1*21 + 0*20 =&nbsp; 8 + 4 + 2 + 0 = 14
Input: LinkedList: 0 -&gt; 1 -&gt; 1     Output: 3Explanation: 0*22&nbsp;+ 1*21 + 1*20 =&nbsp; 1 + 2 + 0 = 3
Constraints:0&nbsp;≤ size of LinkedLists ≤&nbsp;106Data of each node is either 0 or 1