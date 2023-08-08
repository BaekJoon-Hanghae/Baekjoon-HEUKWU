package ThisIsCodingTest.implementation.게임_개발;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int direction = Integer.parseInt(st.nextToken());
        int[][] d = new int[n][m];

        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[m];
            for (int j = 0; j < m; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            map[i] = arr;
        }

        int count = 0;
        int turnCount = 0;

        while (true) {
            direction = turn(direction);
            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if (d[nx][ny] == 0 && map[nx][ny] == 0) {
                d[nx][ny] = 1;
                x = nx;
                y = ny;
                count++;
                turnCount = 0;
            } else {
                turnCount++;
            }

            if (turnCount == 4) {
                nx = x - dx[direction];
                ny = y - dy[direction];

                if (map[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                } else {
                    break;
                }

                turnCount = 0;
            }
        }

        System.out.println(count);
    }

    private static int turn(int direction) {
        direction--;
        if (direction == -1) {
            direction = 3;
        }

        return direction;
    }
}
