package baekjoon.datastructure;

import java.util.Scanner;

public class Q1874 {

  // https://www.acmicpc.net/problem/1874

  static int[] stack;
  static int top = 0;
  static int start = 0;


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int count = sc.nextInt();

    StringBuilder ouput = new StringBuilder();

    for (int i = 0; i < count; i++) {

      int input = sc.nextInt();

      if (input > start) {
        for (int j = start + 1; j <= input; j++) {
          stack[top++] = j;
          ouput.append("+").append("\n");
        }
      } else if (stack[top - 1] != input) {
        System.out.println("NO");
        return;
      }


      start = input;
    }

  }

/*  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int count = sc.nextInt();

    Stack<Integer> stack = new Stack<>();
    int start = 0;
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < count; i++) {
      int input = sc.nextInt();

      // input 값이 큰 경우 스택에 삽입
      if (input > start) {

        for (int j = start; j < input; j++) {
          result.append("+").append("\n");
          stack.push(j + 1);
        }

        start = input;
      } else if (stack.peek() != input) {
        System.out.println("NO");
        return;
      }

      stack.pop();
      result.append("-").append("\n");
    }
    System.out.println(result);

  }*/
}
