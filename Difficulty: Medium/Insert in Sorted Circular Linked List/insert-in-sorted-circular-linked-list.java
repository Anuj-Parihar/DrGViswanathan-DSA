/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node sortedInsert(Node head, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        if (data <= head.data) {
            while (temp.next!=head) {
                temp = temp.next;
            }
            temp.next =newNode;
            newNode.next =head;
            head = newNode;
            return head;
        }
        temp = head;
        while (temp.next!=head && temp.next.data<data) {
            temp =temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }
}
