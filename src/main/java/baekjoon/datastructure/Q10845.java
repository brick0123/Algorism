package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q10845 {

  // https://www.acmicpc.net/problem/10845

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // push

    // pop or -1
    // size
    // empty 1 or 0
    // front or -1
    // back or -1
    int count = Integer.parseInt(br.readLine());
    Queue<String> queue = new LinkedList<>();

    String lastEl = "";
    for (int i = 0; i < count; i++) {
      String[] input = br.readLine().split(" ");

      String operator = input[0];
      String output = "init";

      switch (operator) {
        case "push":
          queue.offer(input[1]);
          lastEl = input[1];
          break;
        case "pop":
          if (!queue.isEmpty()) {
            output = queue.poll();
          } else {
            output = "-1";
          }
          break;
        case "size":
          output = queue.size() + "";
          break;
        case "empty":
          if (queue.isEmpty()) {
            output = "1";
          } else {
            output = "0";
          }
          break;
        case "front":
          if (queue.isEmpty()) {
            output = "-1";
          } else {
            output = queue.peek();
          }
          break;
        default:
          if (queue.isEmpty()) {
            output = "-1";
          } else {
            output = lastEl;
          }
          break;
      }
      if (!"init".equals(output)) {
        System.out.println(output);
      }
    }
  }
}
