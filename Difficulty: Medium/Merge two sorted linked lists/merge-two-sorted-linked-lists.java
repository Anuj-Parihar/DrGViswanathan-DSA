/*
  Node is defined as
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        ArrayList<Integer> newList = new ArrayList<>();
        Node temp = head1;
        while(temp!=null){
            newList.add(temp.data);
            temp = temp.next;
        }
        Node temp1 = head2;
        while(temp1!=null){
            newList.add(temp1.data);
            temp1 = temp1.next;
        }
        Collections.sort(newList);
        Node head = new Node(newList.get(0));
        Node current = head;
        for(int i = 1; i < newList.size(); i++) {
            current.next = new Node(newList.get(i));
            current = current.next;
        }
        return head;
    }
}