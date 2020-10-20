/*
Question Link: https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list/problem

You are given the pointer to the head node of a sorted linked list, where the data in the nodes is in ascending order. 
Delete nodes and return a sorted list with each distinct value in the original list. The given head pointer may be null indicating that the list is empty.

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

     static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        SinglyLinkedListNode temp = head;
        while(temp.next != null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }


// Time Complexity - O(n)
// Space Complexity - O(1)
