/* class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}*/
class Solution {
    static Node segregate(Node head) {
        // code here
        ArrayList<Integer> newList = new ArrayList<>();
        Node temp = head;
        while(temp != null){
            newList.add(temp.data);
            temp = temp.next;
       }
       Collections.sort(newList);
        
        temp = head;
        for(int i=0; temp!=null; i++){
            temp.data = newList.get(i);
            temp = temp.next;
        }
        return head;
    }
}