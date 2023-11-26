class Solution {
    public int search(int[] nums, int target) {
        // two pointers, one for each end of the lift
        int left = 0;
        int right = nums.length - 1;
        
        // iterate until left and right pointer meet one another
        while(left <= right) { 
            // create our midpoint pointer
            int mid = (left + right) / 2;

            // we found our target return the index
            if(nums[mid] == target)
                return mid;
            // target is still greater than midpoint, so set left boundary higher
            else if(target > nums[mid])
                left = mid + 1;
            
            // target is still less than midpoint, so set right boundary lower
            else
                right = mid - 1;
        }
        // target couldn't be found, so return -1
        return -1;
    }
}