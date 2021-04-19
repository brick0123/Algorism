package practice.binary;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      int input = sc.nextInt();
      arr[i] = input;
    }

    int start = 0;
    int end = Arrays.stream(arr).max().getAsInt();

    int result = 0;
    while (start <= end) {
      long total = 0;
      int mid = (start + end) / 2;

      for (int i : arr) {
        if (i > mid) {
          total += i - mid;
        }
      }

      if (total < m) {
        end = mid - 1;
      } else {
        result = mid;
        start = mid + 1;
      }

    }
    System.out.println(result);
  }


}
