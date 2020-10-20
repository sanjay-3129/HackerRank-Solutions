/*
Question Link: https://www.hackerrank.com/challenges/reverse-a-linked-list/problem

Given the pointer to the head node of a linked list, change the next pointers of the nodes so that their order is reversed. 
The head pointer given may be null meaning that the initial list is empty.

*/

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

SOLUTION:

     static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        if(head == null || head.next == null) return head;
        
        SinglyLinkedListNode remaining = reverse(head.next); 
        
        head.next.next = head; 
        head.next = null;

        return remaining;
    }


// Time Complexity - O(n)
// Space Complexity - O(n)
