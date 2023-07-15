class Solution {
  public static int[] mergeSort(int[] array) {
    mergeSorting(array);
    return array;
  }
  private static void mergeSorting(int[] array){
    int size = array.length;
    if(size < 2){
      return;
    }
    int midIdx = size / 2;
    int[] leftHalf = new int[midIdx];
    int[] rightHalf = new int[size - midIdx];
    for(int i = 0; i < midIdx; i++){
      leftHalf[i] = array[i];
    }
    for(int j = 0; j < rightHalf.length; j++){
      rightHalf[j] = array[midIdx + j];
    }
    mergeSort(leftHalf);
    mergeSort(rightHalf);
    merge(array, leftHalf, rightHalf);
  }
  private static void merge(int[] array, int[] left, int[] right){
    int leftSize = left.length;
    int rightSize = right.length;
    int i = 0, j = 0, k = 0;
    while(i < leftSize && j < rightSize){
      if(left[i] <= right[j]){
        array[k] = left[i];
        i++;
      }else{
        array[k] = right[j];
        j++;
      }
      k++;
    }

    while(i < leftSize){
      array[k] = left[i];
      i++;
      k++;
    }
    while(j < rightSize){
      array[k] = right[j];
      j++;
      k++;
    }
  }
}
