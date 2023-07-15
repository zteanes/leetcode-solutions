class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        # iterate list, with a current count and another pointer. if
        # number before pointer is the same, increase count, otherwise only
        # one element. if count ever exceeds 1, use pointers to replace 
        # elements in the array and increase return counter

        cnt = 1 # current number counter
        p1 = 1 # first pointer; also ends as number of elements in final list

        for p2 in range(1, len(nums)): # iterate list from 1 to end
            if nums[p2] == nums[p2 - 1]: # if the previous element matches current
                cnt += 1 # increment cnt as we have multiple
            else:
                cnt = 1 # reset cnt as there's only one we know of at current time

            if cnt < 3: # we have a small cnt
                nums[p1] = nums[p2] # rebuild the list as we go
                p1 += 1 # increment amount of elements in the list

        return p1