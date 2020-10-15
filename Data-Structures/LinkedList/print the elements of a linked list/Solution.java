/*
Question Link: https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem

Given a pointer to the head node of a linked list, print each node's  
element, one per line. If the head pointer is null (indicating the list is empty), 
there is nothing to print.
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

    static void printLinkedList(SinglyLinkedListNode head) {
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
    
// Time Complexity - O(n)
// Space Complexity - O(1)
