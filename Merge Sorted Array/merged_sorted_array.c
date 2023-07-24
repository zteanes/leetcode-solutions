#include <stdio.h>

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

int main(){
    int nums1[] = {1, 3, 5, 0, 0, 0};
    int m = 3;
    int nums2[] = {2, 4, 6};
    int n = 3;

    int size1 = sizeof(nums1) / sizeof(nums1[0]);
    int size2 = sizeof(nums2) / sizeof(nums2[0]);

    merge(nums1, size1, m, nums2, size2, n);

    printf("array post merge:");
    for(int i = 0; i < size1; i++){
        printf("%d ", nums1[i]);
    }
}