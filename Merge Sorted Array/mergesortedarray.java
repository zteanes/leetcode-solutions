class mergeSortedArray {  // m number of elements in nums1, n number of elements in nums2
    public void merge(int[] nums1, int m, int[] nums2, int n) { 
        // create variables that will function as pointers to the arrays
        int i = m - 1; // pointer to nums1
        int j = n - 1; // pointer to nums2
        int k = m + n - 1; // pointer to nums1, but at the end of the array

        // traverse nums2 array
        while(j >= 0){
            if(i >= 0 && nums1[i] > nums2[j]) //if nums1[i] is greater and not out of bounds
                nums1[k--] = nums1[i--]; // set nums1[k] to nums1[i] and decrement both pointers
            else
                nums1[k--] = nums2[j--]; // set nums1[k] to nums2[j] and decrement both pointers
        }
    }
}