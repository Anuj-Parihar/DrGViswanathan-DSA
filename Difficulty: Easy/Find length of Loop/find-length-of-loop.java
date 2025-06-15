/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        int count=1;
          Node temp = head, temp1 = head;
        while (temp1!=null && temp1.next!= null) {
            temp=temp.next;
            temp1 =temp1.next.next;
            
            if(temp == temp1){
                Node loopIdx = temp;
                while(loopIdx.next!=temp){
                    count++;
                    loopIdx=loopIdx.next; 
                }
                return count;
            }
        }
        return 0;
    }
}