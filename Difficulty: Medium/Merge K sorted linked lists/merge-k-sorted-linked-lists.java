/*class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

// arr is an array of Nodes of the heads of linked lists

class Solution {
    // Function to merge K sorted linked list.
    Node mergeKLists(List<Node> arr) {
        ArrayList<Integer> allValues=new ArrayList<>();
        for (Node listHead : arr) {
            Node current=listHead;
            while (current != null) {
                allValues.add(current.data);
                current = current.next;
            }
        }
        Collections.sort(allValues);
        Node head =new Node(allValues.get(0));
        Node temp =head;
        for(int i=1;i<allValues.size();i++){
            temp.next=new Node(allValues.get(i));
            temp=temp.next;
        }
        return head;
    }
}