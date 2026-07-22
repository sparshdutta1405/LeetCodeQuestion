/*Complete the function below
Node is as follows:
class Tree{
    int data;
    Tree left,right,random;
    Tree(int d){
        data=d;
        left=null;
        right=null;
        random=null;
    }
}*/
class Solution {

    public Tree cloneTree(Tree root) {
        if (root == null) return null;

        HashMap<Tree, Tree> map = new HashMap<>();
        
        // 1) Create all clone nodes
        createNodes(root, map);
        
        // 2) Link left, right, and random pointers
        linkPointers(root, map);
        
        return map.get(root);
    }
    
    private void createNodes(Tree node, HashMap<Tree, Tree> map) {
        if (node == null) return;
        if (!map.containsKey(node)) {
            map.put(node, new Tree(node.data));
            createNodes(node.left, map);
            createNodes(node.right, map);
        }
    }
    
    private void linkPointers(Tree node, HashMap<Tree, Tree> map) {
        if (node == null) return;
        
        Tree clone = map.get(node);
        clone.left = (node.left != null) ? map.get(node.left) : null;
        clone.right = (node.right != null) ? map.get(node.right) : null;
        clone.random = (node.random != null) ? map.get(node.random) : null;
        
        linkPointers(node.left, map);
        linkPointers(node.right, map);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna