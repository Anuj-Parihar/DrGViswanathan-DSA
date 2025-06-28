/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public void deleteAlt(Node head) {
        // Code Here
        Node temp = head;
        Node temp1 = temp;
        int count = 0;
        while(temp != null){
            count++;
            if(count %2 == 0){
                temp1.next=temp.next;
            }
            temp1 = temp; 
            temp = temp.next;
        }
    }
}