/*
Question Link: https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem

You are given the pointer to the head node of a linked list and an integer to add to the list. 
Create a new node with the given integer. Insert this node at the tail of the linked list and 
return the head node of the linked list formed after inserting this new node. 
The given head pointer may be null, meaning that the initial list is empty.
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

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        node.next = null;

        if(head == null){
            head = node;
            return head;
        }
        SinglyLinkedListNode curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = node;
        return head;
    }
    
// Time Complexity - O(n)
// Space Complexity - O(1)
