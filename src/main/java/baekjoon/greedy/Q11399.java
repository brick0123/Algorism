package baekjoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Q11399 {

  // https://www.acmicpc.net/problem/11399

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int count = sc.nextInt();
    sc.nextLine();
    String[] input = sc.nextLine().split(" ");

    int[] arr = new int[count];

    for (int i = 0; i < count; i++) {
      arr[i] = Integer.parseInt(input[i]);
    }

    Arrays.sort(arr);

    int sum = 0;

    for (int i = 0; i < count; i++) {
      sum += arr[i] * (count - i);
    }

    System.out.println(sum);
  }

}
