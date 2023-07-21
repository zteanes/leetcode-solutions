/* 
class rotateArray {
    public static void rotate(int[] nums, int k) {
        // find algorithm to move all elements to right once and repeat k times
        int len = nums.length; 
        
        for(int i = 0; i < k; i++){ // loop amt of times to rotate
            int next[] = nums.clone(); // create a copy
            int pointer = len - 1; // pointer for placement of elements to new array

            for(int j = 0; j < len; j++){ // loop amt of times equal to length of array
                if(pointer == len) // reset back to beginning of loop
                    pointer = 0;

                nums[j] = next[pointer]; // re-place elements; "rotate"

                pointer++; // increment pointer
            }
        }
    }

    public static void main(String[] args){
        int array[] = {-1, -100, 3, 99};
        rotate(array, 3);
    }
}
*/

/** 
 * another solution that is much more time efficient, but more complicated:
 * say you have [1, 2, 3, 4, 5, 6, 7] with k=3. 
 * we can split k elements from the back, so we have two parts of [1, 2, 3, 4] and [5, 6, 7]. 
 * then we reverse the two separate sides, so we get [4, 3, 2, 1] and [7, 6, 5]. (still one array)
 * then, by reversing the entire array, we're left with [5, 6, 7, 1, 2, 3, 4].
 * 
 * didn't fully create this one, got inspiration from another answer on leetcode
 */

 class rotateArray {
    public static void reverse(int[] nums, int left, int right){
        while(left < right){
            int temp = nums[left]; // grab element and switch the two
            nums[left] = nums[right];
            nums[right] = temp;

            left++; // inc/dec pointers
            right--;
        }
    }
    public static void rotate(int[] nums, int k) {
        // reduce k to minimal amt of rotations required by modulo the length
        // for example, k = 17 is the same as k = 3 when length is 7
        k = k % nums.length;
        if(k < 0)
            k += nums.length;

        // make all necessary reversals 
        reverse(nums, 0, nums.length - k - 1); // left half
        reverse(nums, nums.length - k, nums.length - 1); // right half
        reverse(nums, 0, nums.length - 1); // entire array

    }

    public static void main(String[] args){
        int array[] = {-1, -100, 3, 99};
        rotate(array, 3);
    }
}