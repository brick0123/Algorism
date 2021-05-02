package baekjoon.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q9021 {
  // https://www.acmicpc.net/problem/9012

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int count = Integer.parseInt(br.readLine());

    for (int i = 0; i < count; i++) {
      Stack<Integer> stack = new Stack<>();
      String input = br.readLine();

      for (int j = 0; j < input.length(); j++) {

        char ch = input.charAt(j);
        if ('(' == ch) {
          stack.push(1);
        }

        if (')' == ch && !stack.isEmpty()) {
          stack.pop();
        }
      }

      String output = "";
      if (stack.size() > 0) {
        output = "NO";
      } else {
        output = "YES";
      }

      System.out.println(output);
    }
  }

}
