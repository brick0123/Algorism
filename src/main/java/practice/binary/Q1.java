package practice.binary;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);

    int k = sc.nextInt();
    int[] keys = new int[k];

    for (int i = 0; i < k; i++) {
      keys[i] = sc.nextInt();
    }

    for (int key : keys) {
      int result = Arrays.binarySearch(arr, key);

      String str = "";
      if (result < 0) {
        str = "no ";
      } else {
        str = "yes ";
      }

      System.out.println(str);
    }
  }


}
