package practice.greedy.chap14;

import java.util.Scanner;

public class Q2 {

  // 곱하기 혹은 더하기

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    String input = sc.nextLine();
    int sum = 0;
    for (int i = 0; i < input.length(); i++) {
      int num = input.charAt(i) - '0';

      if (sum == 0) {
        sum += num;
        continue;
      }

      if (num >= 1) {
        sum *= num;
      }
    }
    System.out.println(sum);
  }

}
