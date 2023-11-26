package ThisIsCodingTest.first.implementation.p118_게임_개발;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int n, m, x, y, d;
    private final static int[][] map = new int[51][51];
    private final static boolean[][] visited = new boolean[51][51];

    private final static int[] dx = {-1, 0, 1, 0};
    private final static int[] dy = {0, 1, 0, -1};

    private static void turnLeft() {
        d--;
        if (d == -1) {
            d = 3;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 1;
        int turnCount = 0;

        visited[x][y] = true;

        while (true) {
            turnLeft();

            int nx = x + dx[d];
            int ny = y + dy[d];

            if (map[nx][ny] == 0 && !visited[nx][ny]) {
                visited[nx][ny] = true;
                x = nx;
                y = ny;
                count++;
                turnCount = 0;
            } else {
                turnCount++;

                if (turnCount == 4) {
                    nx = x - dx[d];
                    ny = y - dy[d];

                    if (map[nx][ny] == 0) {
                        x = nx;
                        y = ny;
                        turnCount = 0;
                    } else {
                        break;
                    }
                }
            }
        }

        System.out.println(count);
    }
}

/*
4 4
1 1 0
1 1 1 1
1 0 0 1
1 1 0 1
1 1 1 1
 */