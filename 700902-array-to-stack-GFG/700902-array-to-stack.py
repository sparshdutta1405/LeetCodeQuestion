class Solution:
    
    #  Push elements of an array into a stack.
    def push(self, arr):
        # code here
        stack = []
        for x in arr:
            stack.append(x)
        return stack
    
    #  Print elements of a stack and pop them.
    def printAndPop(self, stack):
        # code here
        while len(stack) > 0:
            print(stack.pop(), end = " ")


# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna