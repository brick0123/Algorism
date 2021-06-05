package code;

public class RobotBoundedCircle {

  public boolean isRobotBounded(String instructions) {

    int[][] location = {{0, 0}};
    int[][] move = {{0, -1}, {1, 0}, {0, 1}, {-1, 0}};
    int dir = 0;
    for (char c : instructions.toCharArray()) {
      if (c == 'L') {
        dir = (dir + 3) % 4;
      } else if (c == 'R') {
        dir = (dir + 1) % 4;
      } else {
        location[0][0] += move[dir][0];
        location[0][1] += move[dir][1];
      }
    }

    return (location[0][0] == 0 && location[0][1] == 0) || dir != 0;
  }
}
