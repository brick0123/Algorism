package code.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  /**
   * https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/546/
   *
   * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
   * You may assume that each input would have exactly one solution, and you may not use the same element twice.
   * You can return the answer in any order.
   */
  public static void main(String[] args) {
  }

  public static int[] twoSum(int[] nums, int target) {
    // O(N)
    int[] result = new int[2];
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int different = target - nums[i];

      if (map.containsKey(different)) {
        // 포함되어 있다면
        result[0] = map.get(different);
        result[1] = i;
        return result;
      }
      map.put(nums[i], i);
    }
    return result;
  }

  // O(N)^2
/*  public int[] twoSum(int[] nums, int target) {

    int[] result = new int[2];
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          result[0] = i;
          result[1] = j;
        }
      }
    }

    return result;
  }*/

}
