package code;

public class NumberOfIsland {

  public int numIslands(char[][] grid) {
    int count = 0;

    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        if (dfs(grid, i, j)) {
          count++;
        }
      }
    }

    return count;
  }

  public boolean dfs(char[][] grid, int i, int j) {
    if (grid[i][j] - '0' == 0) {
      return false;
    }

    grid[i][j] = '0';

    if (i + 1 < grid.length) {
      dfs(grid, i + 1, j);
    }
    if (i - 1 >= 0) {
      dfs(grid, i - 1, j);

    }
    if (j + 1 < grid[i].length) {
      dfs(grid, i, j + 1);
    }
    if (j - 1 >= 0) {
      dfs(grid, i, j - 1);
    }

    return true;
  }
}
