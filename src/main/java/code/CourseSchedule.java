package code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class CourseSchedule {

  public boolean canFinish(int numCourses, int[][] prerequisites) {
    List<List<Integer>> graph = new ArrayList<>();
    int[] degree = new int[numCourses];
    for (int i = 0; i < numCourses; i++) {
      graph.add(new ArrayList<>());
    }

    for (int[] course : prerequisites) {
      graph.get(course[0]).add(course[1]);
      degree[course[1]]++;
    }

    Queue<Integer> queue = new LinkedList<>();
    for (int i = 0; i < graph.size(); i++) {
      if (degree[i] == 0) {
        queue.offer(i);
      }
    }

    Set<Integer> set = new HashSet<>();
    while (!queue.isEmpty()) {
      int num = queue.poll();
      set.add(num);
      for (int i = 0; i < graph.get(num).size(); i++) {
        degree[graph.get(num).get(i)]--;

        if (degree[graph.get(num).get(i)] == 0) {
          queue.offer(graph.get(num).get(i));
        }
      }
    }
    return set.size() == numCourses;

  }

}
