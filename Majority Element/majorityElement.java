class Solution {
    public int majorityElement(int[] nums) {
        // multiple really good approaches to this, first being sorting and grabbing
        // the element in the middle. because we know the element will appear more than
        // n/2 times, we can sort the array and grab the middle element.
        Arrays.sort(nums);
        return nums[nums.length / 2];

        // another is to use Moore's Voting algorithm to choose a candidate
        int cnt = 0;
        int choice = 0;

        for(int i = 0; i < nums.length; i++){ // iterate list
            if(cnt == 0) // either beginning or we know the majority isn't chosen 
                choice = nums[i]; // reset choice
            
            if(nums[i] == choice) //if we encounter our choice again
                cnt++; // increment counter
            else
                cnt--; // decrement counter
        }

        return choice;
    }
}