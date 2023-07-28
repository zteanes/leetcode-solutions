class minSizeSubarraySum {
    /**
     * Solution to problem explained in relevant .txt file.
     * 
     * @param target the sum we want to find
     * @param nums   the array of numbers we can use for the solution
     * @return       the minimal length of a subarray to equal target, 0 if one doesn't exist
     */
    public int minSubArrayLen(int target, int[] nums) {
        /**can be solved like a sliding window problem
         * how the algo works:
         *  1) two pointers, start and end to represent a window
         *  2) move end until we find a valid window
         *  3) when valid window is found, move start to find a smaller window
         */ 
        if(nums == null || nums.length == 0)
            return 0; // end processing if empty
        
        // grab our start and end pointer, along with a min and sum
        int start = 0, end = 0, sum = 0, min = Integer.MAX_VALUE;

        while(end < nums.length){ // while end is smaller than our index
            sum += nums[end++]; // increment sum and end

            while(sum >= target){ // while our sum is greater or equal to our target, reduce sum
                min = Math.min(min, end - start);
                sum -= nums[start];
                start++;
            }
        }

        // if min is the max value, return 0, otherwise return min
        return min == Integer.MAX_VALUE ? 0 : min; 

    }

    // main class for testing
    public static void main(String[] args){
        minSizeSubarraySum sol = new minSizeSubarraySum();
        int[] test = {2, 3, 1, 2, 4, 3};
        sol.minSubArrayLen(7, test);
    }
}