package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q9012 {

  // https://www.acmicpc.net/problem/9012

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 먼저 빼거나
    // 1이상 남아 있거나
    // 정상 종료되거나
    int count = Integer.parseInt(br.readLine());

    for (int i = 0; i < count; i++) {
      String input = br.readLine();

      Stack<Character> stack = new Stack<>();

      boolean isValid = true;
      for (int j = 0; j < input.length(); j++) {
        char ch = input.charAt(j);

        if ('(' == ch) {
          stack.push(ch);
        } else {
          // 비어 있는 상태에서는 끝
          if (stack.isEmpty()) {
            isValid = false;
            break;
          }
          stack.pop();
        }
      }
      // 1개 이상 남아있다
      if (!stack.isEmpty()) {
        isValid = false;
      }

      if (isValid) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
