/*
Question Link: https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list/problem

Given a pointer to the head of a linked list, insert a new node before the head. 
The next value in the new node should point to head and the data value should be replaced with a given value. 
Return a reference to the new head of the list. The head pointer given may be null meaning that the initial list is empty.
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

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode head = llist;
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        
        node.next = head;

        head = node;

        return head;
    }
    
// Time Complexity - O(n)
// Space Complexity - O(1)
