package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {
    @Test void testCaseOne(){
        ListNode l1 = new ListNode(2);

        l1 = new ListNode(4);
        l1 = new ListNode(3);
        int[] numbers = {1,2,3};
        ListNode createdList = ListNode.createLinkedList(numbers);
        int[] convertListToArray = convertLinkedListToArray(createdList);
        assertArrayEquals(numbers,convertListToArray);
    }


    private int[] convertLinkedListToArray(ListNode head) {
        ListNode current = head;
        int count = 0;

        while (current != null) {
            count++;
            current = current.next;
        }

        int[] result = new int[count];
        current = head;
        int index = 0;

        while (current != null) {
            result[index++] = current.val;
            current = current.next;
        }

        return result;
    }

}