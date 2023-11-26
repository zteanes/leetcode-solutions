#include <stdio.h>

int search(int* nums, int numsSize, int target) {
    /**
     * binary search algorithm in C
     * 
     * @param int* nums    the array of numbers
     * @param int numsSize the size of the array
     * @param int target   the target number to find
     * 
     * @return int         the index of the target or -1 if not found
     */
    // create our pointers
    int left = 0, right = numsSize - 1;

    while(left <= right) {
        // create midpoint value to check
        int mid = (left + right) / 2;

        if(target == nums[mid]) {
            return mid;
        } else if(target > nums[mid]) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return - 1;
}

// driver to test the code
int main() {
    int nums[] = {-1,0,3,5,9,12};
    int numsSize = sizeof(nums) / sizeof(nums[0]);
    int target = 9;

    int result = search(nums, numsSize, target);
    printf("The index of the target is: %d\n", result);
    return 0;
}