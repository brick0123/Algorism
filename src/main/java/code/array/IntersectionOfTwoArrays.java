package code.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {

  /**
   * https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/674/
   * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result
   * must appear as many times as it shows in both arrays and you may return the result in any order.
   * <p>
   * Follow up:
   * <p>
   * What if the given array is already sorted? How would you optimize your algorithm? What if nums1's size is small compared to nums2's size? Which algorithm is better? What if elements of nums2 are
   * stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
   */
  public static void main(String[] args) {
    int[] nums1 = {1, 2, 2, 1};
    int[] nums2 = {2, 2};

    int[] result = intersect(nums1, nums2);
    System.out.println(Arrays.toString(result));
  }

  // sort를 이용한 방법
  private static int[] intersect(int[] nums1, int[] nums2) {

    Arrays.sort(nums1);
    Arrays.sort(nums2);

    int i = 0;
    int j = 0;

    // 1 2 2 3 5
    // 1 2 2 9

    //  == > i ++, j++;
    // >  -> i ++
    List<Integer> list = new ArrayList<>();
    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] == nums2[j]) {
        list.add(nums1[i]);
        i++;
        j++;
      } else if (nums1[i] > nums2[j]) {
        j++;
      } else {
        i++;
      }
    }

    int[] result = new int[list.size()];

    for (int k = 0; k < result.length; k++) {
      result[k] = list.get(k);
    }

    return result;
  }

  // Map을 이용한 방법
//  public static int[] intersect(int[] nums1, int[] nums2) {
//    if (nums1.length > nums2.length) {
//      return intersect(nums2, nums1);
//    }
//
//    Map<Integer, Integer> map = new HashMap<>();
//    for (int num : nums1) {
//      map.merge(num, 1, Integer::sum);
//    }
//
//    List<Integer> list = new ArrayList<>();
//    for (int num : nums2) {
//      if (map.getOrDefault(num, 0) > 0) {
//        list.add(num);
//        map.put(num, map.get(num) - 1);
//      }
//    }
//
//    int[] copyArray = new int[list.size()];
//
//    for (int i = 0; i < copyArray.length; i++) {
//      copyArray[i] = list.get(i);
//    }
//
//    return copyArray;
//  }


}
