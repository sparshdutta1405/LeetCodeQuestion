/*Structure of the node class is
class Node
{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
} */

class Solution {
    private int index = 0;
    Node binaryTreeToBST(Node root) {
        // code here
        ArrayList<Integer> values = new ArrayList<>();
        
        getInOrder(root, values);
        
        Collections.sort(values);
        
        index = 0;
        setInOrder(root, values);
        
        return root;
    }
    
    private void getInOrder(Node root, ArrayList<Integer> values){
        if(root == null) return ;
        
        getInOrder(root.left, values);
        values.add(root.data);
        getInOrder(root.right, values);
    }
    
    
    private void setInOrder(Node root, ArrayList<Integer> values){
        if(root == null) return ;
        
        setInOrder(root.left, values);
        root.data = values.get(index++);
        setInOrder(root.right, values);
    }
    
    
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna