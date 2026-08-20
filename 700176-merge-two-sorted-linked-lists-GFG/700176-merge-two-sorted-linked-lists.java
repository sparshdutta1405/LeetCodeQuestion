/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node list1, Node list2) {
        // code here
        if(list1 == null){
            return list2;
        }

        if(list2 == null){
            return list1;
        }

        if(list1.data > list2.data){
            list2.next = sortedMerge(list2.next, list1);
            return list2;
        }else{
            list1.next = sortedMerge(list1.next, list2);
            return list1;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna