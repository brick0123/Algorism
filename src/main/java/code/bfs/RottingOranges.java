package code.bfs;

import java.util.HashSet;
import java.util.Set;

public class RottingOranges {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.orangesRotting(
            new int[][]{{2,1,1},{0,1,1},{1,0,1}}
        );
    }

}

class Solution {
    public int orangesRotting(int[][] grid) {
        Set<String> rotten = new HashSet<>();
        Set<String> fresh = new HashSet<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    fresh.add("" + i + j);
                } else if (grid[i][j] == 2) {
                    rotten.add("" + i + j);
                }
            }
        }

        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        int result = 0;
        while (!fresh.isEmpty()) {
            Set<String> infected = new HashSet<>();

            for (String s : rotten) {
                int i = s.charAt(0) - '0';
                int j = s.charAt(1) - '0';

                for (int[] dir : dirs) {
                    int nx = i + dir[0];
                    int ny = j + dir[1];

                    String move = "" + nx + ny;
                    if (fresh.contains(move)) {
                        fresh.remove(move);
                        infected.add(move);
                    }
                }
            } // end loop

            result++;
            if (infected.size() == 0) {
                return -1;
            }

            rotten = infected;
        }
        return result;
    }
}
