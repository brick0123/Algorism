package code.array;

import java.util.Arrays;

public class KthLargestElement {

  public static void main(String[] args) {
    int[] nums = {3,2,3,1,2,4,5,5,5};
    int k = 4;

    int kthLargest = findKthLargest(nums, k);
    Arrays.sort(nums);
    System.out.println(Arrays.toString(nums));
    System.out.println("kthLargest = " + kthLargest);

  }

  public static int findKthLargest(int[] nums, int k) {
    Arrays.sort(nums);
    return nums[nums.length - k];
  }

}

// 3 2 1 5 6 4  k=2
// 1 2 3 4 5 6