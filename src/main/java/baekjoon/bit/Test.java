package baekjoon.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] size = br.readLine().split(" ");

    int h = Integer.parseInt(size[0]);
    int w = Integer.parseInt(size[1]);

    int[][] graph = new int[h][w];

    // input -> graph
    for (int i = 0; i < h; i++) {
      String[] input = br.readLine().split(" ");
      for (int j = 0; j < w; j++) {
        graph[i][j] = Integer.parseInt(input[j]);
      }
    }

    System.out.println(Arrays.deepToString(graph));
  }
}
