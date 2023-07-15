class Solution {
    public int removeDuplicates(int[] nums) {
        // same logic from python solution; just used as practice to
        // rewrite to a different language

        int cnt = 1; // current number counter
        int p1 = 1; // first pointer in list; also number of elements in final list
                    // and acts as a pointer for the rebuilt list

        for(int p2 = 1; p2 < nums.length; p2++){ // iterate list from 1 to end
            if(nums[p2] == nums[p2 - 1]) // if last element same as current
                cnt++; // increment cnt as we know we have multiple
            else 
                cnt = 1; // otherwise only one/reset cnt

            if(cnt < 3){ // while we have less than two elements
                nums[p1] = nums[p2]; //remake/place elements as we go
                p1 += 1; // increment pointer 
            }
        }
        return p1;
    }
}