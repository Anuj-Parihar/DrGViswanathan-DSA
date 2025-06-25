/* Link list Node
class Node
{
    Node next;
    int data;
    Node(int d)
    {
        data = d;
        next = null;
    }
}*/
class Solution {
    /*You are required to complete this method*/
    Node deleteK(Node head, int k) {
        // Your code here
        if(k<=1){
            return new Node(-1);
        }
        Node temp = head;
        Node temp1 = null;
        int count =0;
        while(temp!=null){
            count++;
            if(count == k){
                temp1.next = temp.next;
                count = 0;
            }
            temp1 =temp;
            temp =temp.next;
        }
        return head;
    }
}