void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n){
    // create pointers
    int i = m - 1;
    int j = n - 1;
    int k = m + n - 1;

    // traverse through nums2 and merge
    while(j >= 0){
        if(i >= 0 && nums1[i] > nums2[j])
            nums1[k--] = nums1[i--];
        else
            nums1[k--] = nums2[j--];
    }
}