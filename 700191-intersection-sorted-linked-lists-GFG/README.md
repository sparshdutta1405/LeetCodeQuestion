# [Intersection Sorted Linked Lists](https://www.geeksforgeeks.org/problems/intersection-of-two-sorted-linked-lists/1)
## Easy

Given two singly linked lists head1 and head2, where both lists are sorted in increasing order, find their intersection and create a new linked list containing all the common elements.

If an element occurs multiple times in both lists, it should appear in the intersection as many times as it occurs in both lists.
The original linked lists should not be modified.


Examples:
Input: head1 = 1 -&gt; 2 -&gt; 3 -&gt; 4 -&gt; 6, head2 = 2 -&gt; 4 -&gt; 6 -&gt; 8
Output: 2 -&gt; 4-&gt; 6
Explanation: For the given two linked list, 2, 4 and 6 are the elements in the intersection.
Input: head1 = 1 -&gt; 2 -&gt; 2 -&gt; 3 -&gt; 4, head2 = 2 -&gt; 2 -&gt; 2 -&gt; 4 -&gt; 5
Output: 2 -&gt; 2 -&gt; 2 -&gt; 3 -&gt; 4Explanation: For the given two linked list, 2, 2 and 4 are the elements in the intersection.