// User function Template for Java

/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node divide(Node head) {
        if (head == null || head.next == null) return head;

        Node evenDummy =new Node(0);  
        Node oddDummy =new Node(0); 
        Node evenTail = evenDummy;
        Node oddTail = oddDummy;

        Node curr = head;
        while (curr!=null) {
            if (curr.data % 2==0) {
                evenTail.next =curr;
                evenTail=evenTail.next;
            } else {
                oddTail.next=curr;
                oddTail = oddTail.next;
            }
            curr =curr.next;
        }
        evenTail.next =oddDummy.next;
        oddTail.next =null; 
        return evenDummy.next;
    }
}
