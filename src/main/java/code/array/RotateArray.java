package code.array;

import java.util.Arrays;

public class RotateArray {

  /**
   * https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/646/
   * k만큼 배열을 오른쪽으로 이동하 extra space O(1)
   */
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5, 6, 7};
    rotate(nums, 3);
    // Output: [5,6,7,1,2,3,4]

    System.out.println(Arrays.toString(nums));
  }

  public static void rotate(int[] nums, int k) {
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
  }

  // start = 0, end = 3
  // 1234
  // 4321
  private static void reverse(int[] nums, int start, int end) {
    while (start < end) {
      int tmp = nums[start];
      nums[start] = nums[end];
      nums[end] = tmp;
      start++;
      end--;
    }
  }
}
