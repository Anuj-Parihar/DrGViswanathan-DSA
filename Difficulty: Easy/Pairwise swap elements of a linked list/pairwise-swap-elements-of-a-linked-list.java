/* node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    public Node pairwiseSwap(Node head){
        if (head == null || head.next == null) {
            return head;  
        }
        Node prev = null;
        Node curr = head;
        head = head.next;  
        while (curr != null && curr.next != null) {
            Node temp = curr.next;  
            curr.next = temp.next;     
            temp.next = curr;         
            if (prev != null) {
                prev.next = temp;     
            }
            prev = curr;              
            curr = curr.next;          
        }
        return head;
    }
}

