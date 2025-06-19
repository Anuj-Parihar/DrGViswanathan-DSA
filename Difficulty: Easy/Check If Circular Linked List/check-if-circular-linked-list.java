/* Structure of LinkedList
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    boolean isCircular(Node head) {
        // Your code here
        Node temp = head.next;
        while(temp!=null){
            if(temp == head){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}