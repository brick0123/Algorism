package code;

public class ProductOfArrayExceptSelf {

  public int[] productExceptSelf(int[] nums) {
    int len = nums.length;

    int[] left = new int[len];
    left[0] = 1;

    for (int i = 1; i < len; i++) {
      left[i] = left[i - 1] * nums[i - 1];
    }

    int right = 1;
    for (int i = len - 1; i >= 0; i--) {
      left[i] = left[i] * right;
      right *= nums[i];
    }

    return left;
  }

}
