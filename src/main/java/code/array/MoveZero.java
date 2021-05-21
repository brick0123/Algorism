package code.array;

public class MoveZero {

  /**
   * https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/567/
   * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
   * Note that you must do this in-place without making a copy of the array.
   */
  public static void main(String[] args) {

    int[] nums = {0, 1, 0, 3, 12};
    moveZeroes(nums);
  }

  public static void moveZeroes(int[] nums) {

    int index = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[index++] = nums[i];
      }
    }

    for (int i = index; i < nums.length; i++) {
      nums[i] = 0;
    }
  }

}
