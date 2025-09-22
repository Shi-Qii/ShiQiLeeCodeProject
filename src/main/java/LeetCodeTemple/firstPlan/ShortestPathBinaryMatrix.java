package LeetCodeTemple.firstPlan;

import java.util.*;

public class ShortestPathBinaryMatrix {
    private static final int[][] DIRS = {
            {1,0}, {-1,0}, {0,1}, {0,-1},
            {1,1}, {1,-1}, {-1,1}, {-1,-1}
    };

    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] == 1 || grid[n-1][n-1] == 1) return -1;
        if (n == 1) return 1; // single cell and it's 0

        boolean[][] visited = new boolean[n][n];
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0});
        visited[0][0] = true;
        int steps = 1; // starting cell counts as step 1

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] cur = q.poll();
                int r = cur[0], c = cur[1];
                for (int[] d : DIRS) {
                    int nr = r + d[0], nc = c + d[1];
                    if (nr < 0 || nc < 0 || nr >= n || nc >= n) continue;
                    if (visited[nr][nc] || grid[nr][nc] == 1) continue;
                    if (nr == n-1 && nc == n-1) return steps + 1;
                    visited[nr][nc] = true;
                    q.offer(new int[]{nr, nc});
                }
            }
            steps++;
        }
        return -1;
    }

    // 測試
    public static void main(String[] args) {
        ShortestPathBinaryMatrix solver = new ShortestPathBinaryMatrix();
        int[][] grid = {
                {0,1},
                {1,0}
        };
        System.out.println(solver.shortestPathBinaryMatrix(grid)); // output: 2
    }
}

