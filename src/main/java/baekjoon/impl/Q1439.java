package baekjoon.impl;

import java.util.Scanner;

public class Q1439 {

  // https://www.acmicpc.net/problem/1439

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count0 = 0, count1 = 0;

    String input = sc.nextLine();

    if (input.charAt(0) - '0' == 0) {
      count0++;
    } else {
      count1++;
    }

    for (int i = 0; i < input.length() - 1; i++) {
      int num = input.charAt(i) - '0';
      int num2 = input.charAt(i + 1) - '0';

      if (num != num2) {

        if (num2 == 0) {
          count0++;
        } else {
          count1++;
        }
      }
    }

    System.out.println(Math.min(count0, count1));
  }

}
