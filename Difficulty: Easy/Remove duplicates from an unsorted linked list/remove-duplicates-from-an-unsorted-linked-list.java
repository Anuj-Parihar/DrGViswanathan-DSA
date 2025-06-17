/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    // Function to remove duplicates from an unsorted linked list.
    public Node removeDuplicates(Node head) {

        LinkedHashSet<Integer> newSet = new LinkedHashSet<>();
        Node temp = head;
        while (temp != null) {
            newSet.add(temp.data);
            temp = temp.next;
        }
        temp = head;
        Node curr = null;
        for (Integer value : newSet) {
            temp.data = value;
            curr = temp;
            temp = temp.next;
        }
        if (curr != null){
            curr.next = null;
        }
        return head;
    }
}

