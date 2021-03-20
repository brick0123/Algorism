package practice.greedy;

import static java.lang.Integer.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);

    int first = arr[n - 1];
    int second = arr[n - 2];

    // 가장 큰 수가 더해지는 횟수 계산
    int count = (m / (k + 1)) * k;
    count += m % (k + 1);

    int result = 0;

    result += first * count;
    result += (m - count) * second;

    System.out.println(result);
  }

}
