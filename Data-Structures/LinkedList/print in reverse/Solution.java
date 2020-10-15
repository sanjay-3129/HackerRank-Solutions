/*
Question Link: https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse/problem

Given a pointer to the head of a singly-linked list, print each  value from the reversed list. 
If the given list is empty, do not print anything.
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
    
    // recursion is the efficient solution to solve it
    static void reversePrint(SinglyLinkedListNode head) {
        if(head.next!=null) 
            reversePrint(head.next);
        System.out.println(head.data);
    }
    
// Time Complexity - O(n)  - bcs it traverse every element from tail to head
// Space Complexity - O(n) - the recursie methods are stored in stack to complete further, so it takes O(n).
