package baekjoon.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1316 {

  // https://www.acmicpc.net/problem/1316

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int count = Integer.parseInt(br.readLine());

    int result = count;
    for (int i = 0; i < count; i++) {
      String input = br.readLine();

      int[] check = new int[26];

      check[input.charAt(0) - 'a'] = 1;

      for (int j = 0; j < input.length() - 1; j++) {
        int m = input.charAt(j) - 'a';
        int n = input.charAt(j + 1) - 'a';

        if (m != n) {
          if (check[n] == 1) {
            result--;
            break;
          }
          check[n] = 1;
        }
      }
    }
    System.out.println(result);
  }

}
