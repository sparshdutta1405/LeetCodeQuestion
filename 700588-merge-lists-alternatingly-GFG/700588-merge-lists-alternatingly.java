/*
The structure of node class is :
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public Node[] mergeList(Node head1, Node head2) {
        // write your code here, and print the result
        Node p_current = head1;
        Node q_current = head2;
        Node p_next, q_next;
        
        while(p_current != null && q_current != null){
            p_next = p_current.next;
            q_next = q_current.next;
            p_current.next = q_current;
            q_current.next = p_next;
            p_current = p_next;
            q_current = q_next;
        }
        
        return new Node[]{head1, q_current};
        
        
    }
}