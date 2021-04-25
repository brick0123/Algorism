package practice.dynamic;

import java.util.Scanner;

public class Q2 {

  public static int[] d = new int[30001];

  /**
   * a. X가 5로 나누어 떨어지면 5로 나눈다
   * b. X가 3으로 나누어 떨어지면 3으로 나눈다
   * c. X가 c2로 나누어 떨어지면 2로 나눈다
   * d. X에서 1을 뺀다.
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();

    // 바텀업
    for (int i = 2; i <= x; i++) {
      // 현재의 수에서 1을 빼는 경우
      d[i] = d[i - 1] + 1;
      // 현재의 수가 2로 나누어 떨어지는 경우
      if (i % 2 == 0)
        d[i] = Math.min(d[i], d[i / 2] + 1);
      // 현재의 수가 3으로 나누어 떨어지는 경우
      if (i % 3 == 0)
        d[i] = Math.min(d[i], d[i / 3] + 1);
      // 현재의 수가 5로 나누어 떨어지는 경우
      if (i % 5 == 0)
        d[i] = Math.min(d[i], d[i / 5] + 1);
    }

    System.out.println(d[x]);
  }

}
