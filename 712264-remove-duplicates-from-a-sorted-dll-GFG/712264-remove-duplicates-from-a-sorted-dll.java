/* Structure of a link list node
class Node {
    int data;  // value stored in node
    Node next;
    Node prev;

    Node(int value) {
        data = value;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node headRef) {
        // code here
        if(headRef == null){
            return null;
        }
        
        
        Set<Integer> hash = new LinkedHashSet<>();
        
        Node temp = headRef;
        
        while(temp != null){
            hash.add(temp.data);
            temp = temp.next;
        }
        
        List<Integer> arr = new ArrayList<>(hash);
        
        Node head = new Node(0);
        Node counter = head;
        int i = 0;
        
        
        // for(int val: arr){
        //     Node newNode = new Node(val);
        //     counter.next = newNode;
        //     newNode.prev = counter;
        //     counter = newNode;
        // }
        
        while(i < arr.size()){
            Node tempo = new Node(arr.get(i));
            counter.next = tempo;
            tempo.prev = counter;
            counter = tempo;
            // System.out.println(counter.data);
            i++;
            
        }
        
        
        return head.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna