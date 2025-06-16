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
    public static Node reverseKGroup(Node head, int k) {
        // code here
        ArrayList<Integer> newList = new ArrayList<>();
        Node temp = head;
        int count =0;
       while(temp != null){
            newList.add(temp.data);
            temp = temp.next;
       }
       
        for (int i = 0; i < newList.size(); i += k) {
            int right =Math.min(i+k, newList.size());
            Collections.reverse(newList.subList(i,right));
        }
       
        temp = head;
        for(int i=0; temp!=null; i++){
            temp.data = newList.get(i);
            temp = temp.next;
        }
        return head;
    }
}