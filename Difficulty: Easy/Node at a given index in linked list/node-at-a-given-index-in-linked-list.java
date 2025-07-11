/*node class of the linked list
class Node
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

class Solution {
    public int GetNth(Node head, int index) {
        // Code here
        Node temp = head;
        int count =0;
        while(temp!=null){
            count++;
            if(count == index){
                return temp.data;
            }
            temp = temp.next;
        }
        return -1;
    }
}