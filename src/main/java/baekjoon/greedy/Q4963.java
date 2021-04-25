package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4963 {

  // https://www.acmicpc.net/problem/4963

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {

      String[] size = br.readLine().split(" ");

      int w = Integer.parseInt(size[0]);
      int h = Integer.parseInt(size[1]);

      if (w == 0 && h == 0) {
        return;
      }

      int[][] graph = new int[h][w];

      // input -> graph
      for (int i = 0; i < h; i++) {
        String[] input = br.readLine().split(" ");
        for (int j = 0; j < w; j++) {
          graph[i][j] = Integer.parseInt(input[j]);
        }
      }

      int result = 0;

      for (int i = 0; i < h; i++) {
        for (int j = 0; j < w; j++) {

          if (graph[i][j] != 1) {
            continue;
          }
          result++;

          dfs(graph, i, j);
        }
      }

      System.out.println(result);
    }
  }

  private static void dfs(int[][] graph, int i, int j) {
    if (i < 0 || i >= graph.length || j < 0 || j >= graph[0].length) {
      return;
    }

    if (graph[i][j] == 1) {
      // 방문 처리
      graph[i][j] = 2;

      // right
      dfs(graph, i, j + 1);

      // right up
      dfs(graph, i - 1, j + 1);

      // right down
      dfs(graph, i + 1, j + 1);

      // left
      dfs(graph, i, j - 1);

      // left up
      dfs(graph, i - 1, j - 1);

      // left down
      dfs(graph, i + 1, j - 1);

      // up
      dfs(graph, i - 1, j);

      // down
      dfs(graph, i + 1, j);
    }
  }
}
