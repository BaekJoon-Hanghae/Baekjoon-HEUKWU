package ThisIsCodingTest.dijkstra.미래_도시;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        System.out.println(floydWarshall(br, n, m));
    }

    private static int floydWarshall(BufferedReader br, int n, int m) throws IOException {
        final int INF = (int) 1e9;
        int[][] graph = new int[101][101];
        for (int i = 0; i < 101; i++) {
            Arrays.fill(graph[i], INF);
        }

        for (int i = 1; i <= n; i++) {
            graph[i][i] = 0;
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            for (int a = 1; a <= n; a++) {
                for (int b = 1; b <= n; b++) {
                    graph[a][b] = Math.min(graph[a][b], graph[a][i] + graph[i][b]);
                }
            }
        }

        int distance = graph[1][k] + graph[k][x];

        return distance >= INF ? -1 : distance;
    }
}

/*
5 7
1 2
1 3
1 4
2 4
3 4
3 5
4 5
4 5
 */

/*
4 2
1 3
2 4
3 4
 */