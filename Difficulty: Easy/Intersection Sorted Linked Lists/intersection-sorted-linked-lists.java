/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public static Node findIntersection(Node head1, Node head2) {
        // code here.
        Node temp1 = head1;
        ArrayList<Integer> newarr = new ArrayList<>();

        while (temp1!=null) {
            Node temp2=head2; 
            while (temp2 != null) {
                if (temp1.data ==temp2.data) {
                    newarr.add(temp1.data);
                    break; 
                }
                temp2 =temp2.next;
            }
            temp1 =temp1.next;
        }
        if (newarr.isEmpty()) {
            return null;
        }
        Node head = new Node(newarr.get(0));
        Node curr = head;
        for (int i = 1; i < newarr.size(); i++) {
            curr.next = new Node(newarr.get(i));
            curr = curr.next;
        }
        return head;
    }
}
