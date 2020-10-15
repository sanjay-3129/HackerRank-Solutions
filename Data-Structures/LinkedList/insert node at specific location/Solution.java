/*
Question Link: https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem

Given the pointer to the head node of a linked list and an integer to insert at a certain position, 
create a new node with the given integer as its data attribute, insert this node at the desired position and return the head node.

A position of 0 indicates head, a position of 1 indicates one node away from the head and so on. 
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

    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);  // create a new node with value
        SinglyLinkedListNode temp = head;                            // create a pointer to head
   
        for(int i=0; i<position-1; i++){                            
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
       
        return head;
    }
    
// Time Complexity - O(n)
// Space Complexity - O(1)
