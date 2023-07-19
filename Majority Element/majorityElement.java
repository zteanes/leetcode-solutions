import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        /* Solution 1 */
        // multiple really good approaches to this, first being sorting and grabbing
        // the element in the middle. because we know the element will appear more than
        // n/2 times, we can sort the array and grab the middle element.
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public int majorityElement2(int[] nums){
        /* Solution 2 */
        // another is to use Moore's Voting algorithm to choose a candidate. builds on idea
        // that the element most present will automatically be incremented most whenever
        // it is most prevalent and will end as our choice. algorithm follows that we 
        // increment whenever we encounter current choice, and decrement otherwise
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