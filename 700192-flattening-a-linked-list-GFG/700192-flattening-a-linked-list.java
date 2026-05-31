/* Node structure
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int d) {
        data = d;
        next = null;
        bottom = null;
    }
} */

class Solution {
    Node flatten(Node root) {
        
        if (root == null || root.next == null) {
            return root;
        }

        
        root.next = flatten(root.next);

       
        root = mergeTwoLists(root, root.next);

        
        return root;
    }
    private Node mergeTwoLists(Node a, Node b) {
        Node dummy = new Node(-1);
        Node res = dummy;

        while (a != null && b != null) {
            if (a.data < b.data) {
                res.bottom = a;
                a = a.bottom;
            } else {
                res.bottom = b;
                b = b.bottom;
            }
            res = res.bottom;
            res.next = null; 
        }
        if (a != null) res.bottom = a;
        else res.bottom = b;


        if (dummy.bottom != null) dummy.bottom.next = null;
        return dummy.bottom;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna