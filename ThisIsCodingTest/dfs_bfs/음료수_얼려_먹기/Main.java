package ThisIsCodingTest.dfs_bfs.음료수_얼려_먹기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j, n, m, map)) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }

    static boolean dfs(int x, int y, int n, int m, int[][] map) {
        if (x <= -1 || x >= n || y <= -1 || y >= m) {
            return false;
        }

        if (map[x][y] == 0) {
            map[x][y] = 1;
            dfs(x - 1, y, n, m, map);
            dfs(x, y - 1, n, m, map);
            dfs(x + 1, y, n, m, map);
            dfs(x, y + 1, n, m, map);
            return true;
        }

        return false;
    }
}