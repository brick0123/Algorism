package code.string;

import java.util.Stack;

public class MinRemoveValid {

  public String minRemoveToMakeValid(String s) {
    StringBuilder sb = new StringBuilder(s);
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < sb.length(); i++) {
      char ch = sb.charAt(i);

      if (ch == '(') {
        stack.push(i);
      }

      if (ch == ')') {
        if (!stack.isEmpty()) {
          stack.pop();
        } else {
          sb.setCharAt(i, '+');
        }
      }
    }

    while (!stack.isEmpty()) {
      sb.setCharAt(stack.pop(), '+');
    }
    return sb.toString().replaceAll("[+]", "");
  }

}
