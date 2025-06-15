/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}*/

class Intersect {
    // Function to find intersection point in Y shaped Linked Lists.
    static Node intersectPoint(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        while (temp1 != temp2) {
            temp1 = (temp1==null)?head2:temp1.next;
            temp2 =(temp2 ==null)?head1:temp2.next;
        }
        return temp1;
    }
}
