package code.array;

public class SingleNumber {

  /**
   * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/
   */
  public static void main(String[] args) {
  }

  public int singleNumber(int[] nums) {
    int x = 0;

    for (int i : nums) {
      x ^= i;
    }

    return x;
  }

}
