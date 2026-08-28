# [Pairwise Consecutive Elements](https://www.geeksforgeeks.org/problems/pairwise-consecutive-elements/1)
## Easy
Given a stack of n integers, determine whether its elements are pairwise consecutive. Starting from the top of the stack, group the elements into consecutive pairs. 
A pair is said to be pairwise consecutive if the absolute difference between the two elements is exactly 1. 
The two elements in a pair may be in either increasing or decreasing order. If the stack contains an odd number of elements, the topmost element is not included in any pair. 
Return true if every pair in the stack is pairwise consecutive. Otherwise, return false.
Note: The original contents and order of the stack must remain unchanged after the function returns.
Examples:
Input: stack = [4, 5, -2, -3, 11, 10, 5, 6, 20]
Output: true
Explanation: The rightmost element represents the top of the stack. Since the stack contains an odd number of elements, the top element (20) is ignored. The remaining pairs, starting from the top, are (6, 5), (10, 11), (-3, -2), and (5, 4). The absolute difference between the elements of each pair is 1. Therefore, the answer is true.
Input: stack = [4, 6, 7, 8, 10, 11]
Output: false
Explanation: The top of the stack is 11. The pairs formed from the top are (11, 10), (8, 7), and (6, 4). While the first two pairs are consecutive, the pair (6, 4) is not. Therefore, the answer is false.