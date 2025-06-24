/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
     private static Node reverse(Node head) {
        Node curr = head;
        Node prev = null;
        Node next = null;
        while (curr!= null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    private static Node add(Node num1, Node num2){
        int carry = 0;
        Node ansHead =null;
        Node ansTail =null;

        while (num1 !=null || num2 !=null || carry!=0){
            int val1 =0;
            if(num1 != null){
                val1 = num1.data;
            } else {
                val1 =0;
            }
            int val2 =0;
            if(num2 != null){
                val2 = num2.data;
            } else {
                val2 =0;
            }
            int sum = carry + val1 + val2;
            int digit = sum % 10;
            carry = sum / 10;

            Node temp = new Node(digit);
            if (ansHead == null) {
                ansHead = temp;
                ansTail = temp;
            } else {
                ansTail.next=temp;
                ansTail = temp;
            }

            if (num1!=null){
                num1 = num1.next;
            }
            if (num2!=null){
                num2 = num2.next;
            }
        }
        return ansHead;
    }
    public Node addOne(Node head) {
        Node head1 = new Node(1);
         head = reverse(head);
         head1 = reverse(head1);
         Node answerList =add(head, head1);
        answerList =reverse(answerList);
        return answerList;
    }
}