class rotateArray {
    public static void rotate(int[] nums, int k) {
        // find algorithm to move all elements to right once and repeat k times

        for(int i = 0; i < k; i++){ // loop amt of times to rotate
            int next[] = new int[nums.length]; // create a new array
            int pointer = nums.length - 1; // pointer for placement of elements to new array

            for(int j = 0; j < nums.length; j++){ // loop amt of times equal to length of array
                if(pointer == nums.length) // reset back to beginning of loop
                    pointer = 0;

                next[j] = nums[pointer]; // re-place elements; "rotate"

                pointer++; // increment pointer
            }

        }
    }


    public static void main(String[] args){
        int array[] = {1,2,3,4,5,6,7};
        rotate(array, 3);
    }
}