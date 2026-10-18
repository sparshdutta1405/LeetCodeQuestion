/* Structure of doubly linked list Node
class Node {
  public int data;
  public Node next;
  public Node prev;

  public Node(int x) {
      data = x;
      next = null;
      prev = null;
  }
};*/
class Solution {
    public List<List<Integer>> displayList(Node head) {
        // code here
        List<List<Integer>> result = new ArrayList<>();
        
        List<Integer> forward = new ArrayList<>();
        List<Integer> backward = new ArrayList<>();
        
        Node temp = head;
        Node temp1 = null;
        
        while(temp != null){
            forward.add(temp.data);
            temp1 = temp;
            temp = temp.next;
        }
        
        temp = temp1;
        
        while(temp != null){
            backward.add(temp.data);
            temp = temp.prev;
        }
        
        result.add(forward);
        result.add(backward);
        
        return result;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna