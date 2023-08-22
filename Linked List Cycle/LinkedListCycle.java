/**
 * Given a linked list, determine if it has a cycle in it.
 */
public class LinkedListCycle{
    /**
     * Main method for processing / testing finding a linked list cycle
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // Create nodes
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        
        // Create a cycle by linking the last node to the second node
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;  // Cycle
        
        // Create an instance of the linkedListCycle class
        Solution cycleChecker = new Solution();
        
        // Check for a cycle in the linked list
        boolean hasCycle = cycleChecker.hasCycle(node1);
        
        if (hasCycle) {
            System.out.println("The linked list contains a cycle.");
        } else {
            System.out.println("The linked list does not contain a cycle.");
        }
    }
}

/**
 * Class for finding a cycle in a linked list
 */
class Solution{
    
    /**
     * Given a head to a linked list, this method determines if the linked list
     * has a cycle inside of it.
     * 
     * @param head first node / head of a linked list
     * @return true if the linked list contains a cycle, false otherwise
     */
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head; // pointers for nodes in linked list

        while(fast != null && fast.next != null){
            slow = slow.next; // iterate slow
            fast = fast.next.next; // doubly increment fast
 
            if(slow == fast){ // if equal
                return true; // cycle found
            }
        }
        return false; // no cycle found
    }
}

/**
 * Class for defining a node in a linked list
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}