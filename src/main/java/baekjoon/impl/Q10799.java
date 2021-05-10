package baekjoon.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q10799 {

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine();

    int result = 0;
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < input.length(); i++) {

      char ch1 = input.charAt(i);

      char ch2 = ' ';

      if (i != input.length() - 1) {
        ch2 = input.charAt(i + 1);
      }

      if (ch1 == '(' && ch2 == ')') {
        result += stack.size();
      } else {

        if (ch1 == '(') {
          stack.push(1);
        } else {
          if (input.charAt(i - 1) == '(') {
            continue;
          }
          if (!stack.isEmpty()) {
            result++;
            stack.pop();
          }
        }
      }
    }

    System.out.println(result);
  }

}
