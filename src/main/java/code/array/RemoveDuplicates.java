package code.array;

public class RemoveDuplicates {

  /**
   * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
   */
  public static void main(String[] args) {

  }

  public int removeDuplicates(int[] nums) {
    int index = 1;

    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] != nums[i + 1]) {
        nums[index++] = nums[i + 1];
      }
    }

    return index;
  }
}
