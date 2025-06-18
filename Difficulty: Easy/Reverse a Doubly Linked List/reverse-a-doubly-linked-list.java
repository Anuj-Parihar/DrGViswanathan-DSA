/*
class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution{
    public DLLNode reverseDLL(DLLNode head){
        DLLNode cur=head;
        DLLNode preN = null;

        while (cur!=null){
            DLLNode nextNode=cur.next;
            cur.next =preN;
            cur.prev=nextNode; 
            preN = cur;
            cur =nextNode;
        }
        return preN; 
    }
}
