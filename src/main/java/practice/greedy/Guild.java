package practice.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Guild {

  // P. 506

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int count = Integer.parseInt(br.readLine());
    String[] input = br.readLine().split(" ");

    int[] arr = new int[count];
    for (int i = 0; i < count; i++) {
      arr[i] = Integer.parseInt(input[i]);
    }

    Arrays.sort(arr);

    int result = 0;

    int num = 0;
    for (int i : arr) {
      if (++num >= i) {
        result++;
        num = 0;
      }
    }

    System.out.println(result);

  }

}
