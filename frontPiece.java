/*
Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.


frontPiece([1, 2, 3]) → [1, 2]
frontPiece([1, 2]) → [1, 2]
frontPiece([1]) → [1]
*/


public int[] frontPiece(int[] nums) {
  int[] array = new int[2];
  if (nums.length <= 2) {
    return nums;
  } 
  else if (nums.length > 2) {
     array[0] = nums[0];
     array[1] = nums[1];
  }
  return array;
}
