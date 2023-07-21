class Solution:
    def reverse(self, nums, left, right):
        """
        nums: the list of nums to be rotated
        left: left position of list to start reversal
        right: right position of list to end reversal
        """
        while left < right:
            temp = nums[left] # grab element and switch
            nums[left] = nums[right]
            nums[right] = temp

            left += 1 # increment and decrement pointers
            right -= 1


    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        length = len(nums)

        k = k % length # get necessary position of reversal
        if k < 0:
            k += length
        
        self.reverse(nums, 0, length - k - 1)
        self.reverse(nums, length - k, length - 1)
        self.reverse(nums, 0, length - 1)

        
