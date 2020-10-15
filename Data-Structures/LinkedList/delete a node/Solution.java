/*
Question Link: https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem

Delete the node at a given position in a linked list and return a reference to the head node. 
The head is at position 0. The list may be empty after you delete the node. In that case, return a null value.
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

// SOLUTION - 1: NORMAL LOOP
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        if(position == 0){                    // first position, then change the head to next node and return it.
          head = head.next;  
          return head;
        }
        
        SinglyLinkedListNode temp = head;
        
        for(int i=0; i<position-1; i++){     // if you want to delete a node in center or at the tail position
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
    
// Time Complexity - O(n)
// Space Complexity - O(1)


// SOLUTION - 2: RECURSIVE METHOD, most efficient and neat solutio

  static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        if (position == 0){ return head.next; }
        head.next = deleteNode(head.next, position-1);
        return head;
    }

// Time Complexity - O(n)
// Space Complexity - O(n)
