/* Structure of the node*/
/* class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
} */

class Solution {
    Node mergeResult(Node node1, Node node2){
        Node node3 =new Node(-1);
        Node temp = node3;
        while (node1 !=null && node2 !=null){
            if (node1.data <= node2.data){
                temp.next = node1;
                node1 = node1.next;
            } else{
                temp.next =node2;
                node2 =node2.next;
            }
            temp = temp.next;
        }
        if (node1 != null){
            temp.next = node1;
        }
        if (node2 != null) {
            temp.next = node2;
        }
        //reverse
        Node prev = null;
        Node curr = node3.next;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}
