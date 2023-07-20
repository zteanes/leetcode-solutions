class removeElement {
    public int removeElem(int[] nums, int val) {
        int cnt = 0; // count of non-val elements

        // iterate array s.t. we identify cnt of val elements abd rearrange array
        for (int i = 0; i < nums.length; i++) { // go through # of elements
            if (nums[i] != val) { // if element is not val
                nums[cnt++] = nums[i]; // replace element at cnt with element at i
            }
        }
        return cnt; // return count of non-val elements
    }
}