package code;

import java.util.Stack;

public class BasicCalculatorV2 {

  public int calculate(String s) {
    Stack<Integer> stack = new Stack<>();
    int len = s.length();
    int currentNum = 0;
    char operation = '+';

    for (int i = 0; i < len; i++) {
      char ch = s.charAt(i);
      if (Character.isDigit(ch)) {
        currentNum *= 10;
        currentNum += ch - '0';
      }
      if (!Character.isDigit(ch) && ch != ' ' || i == len - 1) {
        if (operation == '+') {
          stack.push(currentNum);
        } else if (operation == '-') {
          stack.push(-currentNum);
        } else if (operation == '*') {
          stack.push(stack.pop() * currentNum);
        } else {
          stack.push(stack.pop() / currentNum);
        }
        operation = ch;
        currentNum = 0;
      }
    }

    int sum = 0;
    while (!stack.isEmpty()) {
      sum += stack.pop();
    }

    return sum;
  }

}
