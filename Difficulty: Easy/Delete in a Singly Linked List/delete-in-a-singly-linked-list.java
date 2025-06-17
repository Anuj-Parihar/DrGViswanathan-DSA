/* Linklist node structure
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        int count=0;
        Node temp = head;
        Node temp1 = head;
        while(temp!=null ){
            count++;
            if(x == 1){
                head =head.next;
            }
            if(count == x){
                temp1.next= temp.next;
                break;
            }
            temp1= temp;
            temp = temp.next;
        }
        return head;
    }
}