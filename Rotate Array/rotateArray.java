class rotateArray {
    public static void rotate(int[] nums, int k) {
        // find algorithm to move all elements to right once and repeat k times
        int len = nums.length; 
        
        for(int i = 0; i < k; i++){ // loop amt of times to rotate
            int next[] = new int[len]; // create a new array
            int pointer = len - 1; // pointer for placement of elements to new array

            for(int j = 0; j < len; j++){ // loop amt of times equal to length of array
                if(pointer == len) // reset back to beginning of loop
                    pointer = 0;

                next[j] = nums[pointer]; // re-place elements; "rotate"

                pointer++; // increment pointer
            }
            nums = next; // save the step
        }
    }

    public static void main(String[] args){
        int array[] = {-1, -100, 3, 99};
        rotate(array, 3);
    }
}