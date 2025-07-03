/*
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    public static Node findUnion(Node head1, Node head2) {
        TreeSet<Integer> newSet = new TreeSet<>();
        Node temp = head1;
        while(temp!=null){
            newSet.add(temp.data);
            temp = temp.next;
        }
        temp = head2;
        while(temp!=null){
            newSet.add(temp.data);
            temp = temp.next;
        }
        Node head3 = new Node(0);
        Node temp1 = head3;
        for(int val : newSet){
            temp1.next = new Node(val);
            temp1 = temp1.next;
        }
        return head3.next;
        
    }
}