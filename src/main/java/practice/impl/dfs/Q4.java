package practice.impl.dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q4 {

  public static int n, m;
  public static int[][] graph = new int[201][201];

  public static int dx[] = {-1, 1, 0, 0};
  public static int dy[] = {0, 0, -1, 1};

  public static int bfs(int x, int y) {
    Queue<Node> q = new LinkedList<>();
    q.offer(new Node(x, y));

    // 큐가 빌 때까지 반복하기
    while(!q.isEmpty()) {
      Node node = q.poll();
      x = node.getX();
      y = node.getY();
      // 현재 위치에서 4가지 방향으로의 위치 확인
      for (int i = 0; i < 4; i++) {
        int nx = x + dx[i]; //  6
        int ny = y + dy[i]; //  0
        // 미로 찾기 공간을 벗어난 경우 무시
        if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
        // 벽인 경우 무시
        if (graph[nx][ny] == 0) continue;
        // 해당 노드를 처음 방문하는 경우에만 최단 거리 기록
        if (graph[nx][ny] == 1) {
          graph[nx][ny] = graph[x][y] + 1;
          q.offer(new Node(nx, ny));
        }
      }
    }
    // 가장 오른쪽 아래까지의 최단 거리 반환
    return graph[n - 1][m - 1];

  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    m = sc.nextInt();
    sc.nextLine();

    for (int i = 0; i < n; i++) {
      String str = sc.nextLine();
      for (int j = 0; j < m; j++) {
        graph[i][j] = str.charAt(j) - '0';
      }
    }
    System.out.println(bfs(0, 0));
  }

}

class Node {

  private int x;
  private int y;

  public Node(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
}