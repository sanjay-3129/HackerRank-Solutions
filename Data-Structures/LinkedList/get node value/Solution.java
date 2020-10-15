/*
Question Link: https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail/problem

Given a pointer to the head of a linked list and a specific position, determine the data value at that position. 
Count backwards from the tail node. The tail is at postion 0, its parent is at 1 and so on.
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

// solution - 1: 
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        SinglyLinkedListNode temp = head;
        int count = 0;                            // total number of elements
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int pos = (count)-positionFromTail;       // total - positionFromTail => gives position from head.
        SinglyLinkedListNode node = head;
        for(int i=0; i<pos-1; i++){               // traversing from head till position from head using pointer
            node = node.next;
        }
        return node.data;                        
    }
    
// Time Complexity - O(n)
// Space Complexity - O(1)


// solution - 2: two-pointer technique, make a dry run with simple input, it will be easy to understand.
static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        int index = 0;
        SinglyLinkedListNode current = head;
        SinglyLinkedListNode result = head;
        while(current != null)
        {
            current=current.next;
            if (index++>positionFromTail)
            {
                result=result.next;
            }
        }
        return result.data;
    }

// Time Complexity - O(n)
// Space Complexity - O(1)

// solution - 3: 
int GetNode(SinglyLinkedListNode head,int n) {
    SinglyLinkedListNode temp = head;
    for (int i = 0; head.next != null; i++) {
        head = head.next;
        if ( i >= n) temp = temp.next;
    }
    return temp.data;            
}

// Time Complexity - O(n)
// Space Complexity - O(1)
