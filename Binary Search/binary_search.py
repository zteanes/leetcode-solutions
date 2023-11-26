class Solution:
    def search(self, nums: List[int], target: int) -> int:
        """
        This method defines finding a target index in a list of ints using 
        the binary search algorithm, in O(logn) time.

        Args:
            nums (List[int]): list of sorted number to search through
            target (int): number we are searching for 
        Returns:
            int: index of the number we're searching for, or -1 if not found
        """
        # two pointers used in binary search
        left = 0
        right = len(nums) - 1

        while left <= right:
            # integer division in order to have int vs. float
            mid = (left + right) // 2
            
            # number has been identified so we return index
            if nums[mid] == target:
                return mid
            # target exceeds our bottom boundary, so reset bottom boundary higher
            elif target > nums[mid]:
                left = mid + 1
            # target lower than top boundary, so reset higher boundary lower
            else:
                right = mid - 1
            
        return -1 