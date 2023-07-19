int majorityElement(int* nums, int numsSize) {
    // Sort the array in ascending order using bubble sort
    for (int i = 0; i < numsSize - 1; i++) {
        for (int j = 0; j < numsSize - i - 1; j++) {
            if (nums[j] > nums[j + 1]) { // element before is bigger than next
                int temp = nums[j]; // swap the elements
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
            }
        }
    }
    
    // Return the element at the middle index 
    return nums[numsSize / 2];
}