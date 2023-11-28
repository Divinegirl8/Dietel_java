package leetcode;

public class ListNode {

 int val;
 ListNode next;
 ListNode() {}
 ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode createLinkedList(int[] numbers){
     ListNode listNode = new ListNode();
     ListNode container = listNode;

     for (int number : numbers){
         container.next = new ListNode(number);
         container = container.next;
     }
     return listNode.next;

    }



}
