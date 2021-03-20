package baekjoon.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11723 {
  // https://www.acmicpc.net/problem/11723

  private static int stack = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());

    StringBuilder result = new StringBuilder();

    for (int i = 0; i < count; i++) {
      String[] input = br.readLine().split(" ");
      String operator = input[0];
      int num = 0;

      if (!"all".equals(operator) && !"empty".equals(operator)) {
        num = Integer.parseInt(input[1]);
      }

      String output = "";

      if ("add".equals(operator)) {
        add(num);
      }
      if ("remove".equals(operator)) {
        remove(num);
      }
      if ("check".equals(operator)) {
        output = check(num) + "\n";
      }
      if ("toggle".equals(operator)) {
        toggle(num);
      }
      if ("all".equals(operator)) {
        all();
      }
      if ("empty".equals(operator)) {
        empty(num);
      }
      result.append(output);
    }

    System.out.println(result.toString());
  }

  private static void add(int num) {
    stack = stack | (1 << num -1);
  }

  private static void empty(int num) {
    stack = 0;
  }

  private static void all() {
    stack = (1 << 20) - 1;
  }

  private static void toggle(int num) {
    if (check(num) == 0) {
      add(num);
    } else {
      remove(num);
    }
  }

  private static void remove(int num) {
    int all = (1 << 20) - 1;
    int cha = all ^ (1 << num - 1);
    stack = stack & cha;
  }

  private static int check(int num) {
    return (stack & (1 << (num - 1))) == 0 ? 0 : 1;
  }
}
