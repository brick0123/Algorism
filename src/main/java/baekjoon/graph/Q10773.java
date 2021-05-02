package baekjoon.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Q10773 {

  // 방문 처리
  static boolean[] visited;
  // 그래프
  static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");

    int nodeSize = Integer.parseInt(input[0]);
    int count = Integer.parseInt(input[1]);
    int startNode = Integer.parseInt(input[2]);
    visited = new boolean[nodeSize + 1];

    // 초기화
    for (int i = 0; i < nodeSize + 1; i++) {
      graph.add(new ArrayList<>());
    }

    // 그래프 연결
    for (int i = 0; i < count; i++) {
      String[] node = br.readLine().split(" ");

      int node1 = Integer.parseInt(node[0]);
      int node2 = Integer.parseInt(node[1]);

      graph.get(node1).add(node2);
      graph.get(node2).add(node1);
    }

    // 모든 그래프 오름차순 정렬
    for(ArrayList<Integer> nodes: graph) {
      Collections.sort(nodes);
    }

    dfs(startNode);

    // 방문 초기화
    visited = new boolean[nodeSize + 1];
    System.out.println();

    bfs(startNode);
  }

  public static void dfs(int node) {
    visited[node] = true;

    System.out.print(node + " ");

    for (int i = 0; i < graph.get(node).size(); i++) {
      int x = graph.get(node).get(i);

      if (!visited[x]) {
        dfs(x);
      }
    }
  }

  public static void bfs(int node) {
    Queue<Integer> queue = new LinkedList<>();

    // 초기값 큐 삽입
    queue.offer(node);
    visited[node] = true;

    // 큐가 비어있을 때 까지
    while (!queue.isEmpty()) {
      // 큐 데이터 추출 (노드)
      int x = queue.poll();

      // 방문처리한 큐 순서대로 출력
      System.out.print(x + " ");

      // 해당 노드 bfs
      for (int i = 0; i < graph.get(x).size(); i++) {
        int y = graph.get(x).get(i);

        // 방문하지 않았으면
        if (!visited[y]) {
          // 방문처리
          visited[y] = true;
          queue.offer(y);
        }
      }
    }
  }




}
