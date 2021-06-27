package practice.sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class TopologicalSorting {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int v = sc.nextInt();
    int e = sc.nextInt();
    List<List<Integer>> graph = new ArrayList<>();
    int[] indegree = new int[1000];

    for (int i = 0; i < v; i++) {
      graph.add(new ArrayList<>());
    }

    for (int i = 0; i < e; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();

      graph.get(a).add(b);
      indegree[b]++;
    }

    topologySort(graph, indegree, v);
  }

  private static void topologySort(List<List<Integer>> graph, int[] degree, int v) {
    List<Integer> result = new ArrayList<>();
    Queue<Integer> queue = new LinkedList<>();

    for (int i = 1; i <= v; i++) {
      if (degree[i] == 0) {
        queue.offer(i);
      }
    }

    while (!queue.isEmpty()) {
      int now = queue.poll();
      result.add(now);

      // 해당 원소와 연결된 노드들의 진입차수에서 1 빼기
      for (int i = 0; i < graph.get(now).size(); i++) {
        degree[graph.get(now).get(i)]--;


        if (degree[graph.get(now).get(i)] == 0) {
          queue.offer(graph.get(now).get(i));
        }
      }

   }
  }

}
