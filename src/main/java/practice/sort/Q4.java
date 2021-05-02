package practice.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {

  // 두 배열의 원소 교체
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int count = sc.nextInt();

    int[] a = new int[size];
    int[] b = new int[size];

    for (int i = 0; i < size; i++) {
      a[i] = sc.nextInt();
    }
    for (int i = 0; i < size; i++) {
      b[i] = sc.nextInt();
    }

    Arrays.sort(a);
    Arrays.sort(b);

    for (int i = 0; i < count; i++) {
      a[i] = b[b.length - 1 - i];
    }

    int sum = 0;
    for (int i : a) {
      sum += i;
    }

    System.out.println(sum);
  }

}
