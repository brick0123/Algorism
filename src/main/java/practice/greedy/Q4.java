package practice.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] input = br.readLine().split(" ");

    int n = Integer.parseInt(input[0]);
    int k = Integer.parseInt(input[1]);

    int result = 0;

    while (true) {
      int target = (n = n / k) * k;
      result += (n - target);

      n = target;

      if (n > k) {
        break;
      }
      result += 1;
      n = n / k;
    }

    System.out.println(result);
  }

/*  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] input = br.readLine().split(" ");

    int n = Integer.parseInt(input[0]);
    int k = Integer.parseInt(input[1]);

    int result = 0;

    while (n >= k) {
      while (n % k != 0) {
        n -= 1;
        result += 1;
      }
      n = n / k;
      result += 1;
    }

    while (n > 1) {
      n -= 1;
      result += 1;
    }
  }*/
}
