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
}*/
// complete the below function
class Solution {
    public static int count(Node head, int key) {
        int count =0;
        Node temp = head;
        while(temp != null){
            if(key == temp.data){
                count++;
            }
            temp = temp.next;
        }
        return count;
    }
}