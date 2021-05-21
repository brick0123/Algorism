package code.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

  /**
   * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
   */
  public static void main(String[] args) {

  }

  public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();

    for (int i : nums) {
      if (set.contains(i)) {
        return true;
      } else {
        set.add(i);
      }
    }
    return false;
  }

}
