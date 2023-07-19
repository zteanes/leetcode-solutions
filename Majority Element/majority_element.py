class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        nums.sort()
        return nums[round(len(nums) / 2)]