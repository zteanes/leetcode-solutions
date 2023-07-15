class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        cnt = 0 # count of val elements
        # iterate the list and identify count of val and rearrange
        for i in range(len(nums)):
            if nums[i] != val:
                nums[cnt] = nums[i]
                cnt += 1
        
        return cnt 