from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None) -> None:
        self.val = val
        self.next = next    

class Solution:
    def reverseBetween(self, head: Optional[ListNode], left: int, right: int) -> Optional[ListNode]:
        # make our start variables to help begin iteration and return at end
        start = ListNode(0)
        start.next = head
        
        # grab pointers and iterate to starting position of reversal
        prev = start
        curr = start.next  
        for i in range(1, left):
            curr = curr.next
            prev = prev.next
        
        # reverse the list as needed until end
        for i in range(right - left):
            temp = curr.next 
            curr.next = temp.next 
            temp.next = prev.next 
            prev.next = temp 
        
        return start.next