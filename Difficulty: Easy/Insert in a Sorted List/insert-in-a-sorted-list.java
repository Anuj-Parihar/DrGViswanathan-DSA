/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head, int key) {
        Node newNode = new Node(key);
        if (key <head.data) {
            newNode.next = head;
            return newNode;
        }
        Node current =head;
        while (current.next!=null && current.next.data<key) {
            current =current.next;
        }
        newNode.next =current.next;
        current.next=newNode;
        return head;
     }
}