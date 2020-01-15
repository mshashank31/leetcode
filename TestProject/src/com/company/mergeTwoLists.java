package com.company;

public class mergeTwoLists {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

/*    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode returnNode = new ListNode(-1);
        ListNode headNode = returnNode;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                returnNode.next = l1;
                l1 = l1.next;
            } else {
                returnNode.next = l2;
                l2 = l2.next;
            }
            returnNode=returnNode.next;
        }
        if(l1==null){
            returnNode.next= l2;
        }
        if (l2 == null) {
            returnNode.next=l1
        }
        return headNode.next;
    }*/

    public static void main(String[] args) {
       /* ListNode inputL1 = [1,2,4];
        boolean output = mergeTwoLists(1,2,4],[1,2,4]);
        System.out.println(output);*/
    }
}
