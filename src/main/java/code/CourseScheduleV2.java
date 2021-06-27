package code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseScheduleV2 {

  public int[] findOrder(int numCourses, int[][] prerequisites) {
    int[] indgree = new int[numCourses];
    List<List<Integer>> graph = new ArrayList<>();
    for (int i = 0; i < numCourses; i++) {
      graph.add(new ArrayList<>());
    }

    for (int[] course : prerequisites) {
      graph.get(course[1]).add(course[0]);
      indgree[course[0]]++;
    }

    Queue<Integer> q = new LinkedList<>();
    for (int i = 0; i < numCourses; i++) {
      if (indgree[i] == 0) {
        q.offer(i);
      }

    }

    int[] result = new int[numCourses];
    int index = 0;
    while (!q.isEmpty()) {
      int node = q.poll();

      result[index++] = node;

      for (int des : graph.get(node)) {
        indgree[des]--;

        if (indgree[des] == 0) {
          q.offer(des);
        }
      }

    }

    return index == numCourses ? result : new int[0];
  }
}
