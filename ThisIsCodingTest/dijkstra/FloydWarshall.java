package ThisIsCodingTest.dijkstra;

import java.util.Arrays;
import java.util.Scanner;

public class FloydWarshall {

    public static final int INF = (int) 1e9; // 10억
    public static int n; // 노드의 개수
    public static int m; // 간선의 개수
    public static int[][] graph = new int[501][501]; // 2차원 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        // 최단 거리 테이블 무한으로 초기화
        for (int i = 0; i < 501; i++) {
            Arrays.fill(graph[i], INF);
        }

        // 자신에서 자신으로 가는 비용 0
        for (int i = 1; i <= n; i++) {
            graph[i][i] = 0;
        }

        // 각 간선에 대한 정보 입력
        for (int i = 0; i < m; i++) {
            // A에서 B로 가는 비용 = C
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            graph[a][b] = c;
        }

        // 점화식에 따라 알고리즘 수행
        for (int k = 1; k <= n; k++) {
            for (int a = 1; a <= n; a++) {
                for (int b = 1; b <= n; b++) {
                    graph[a][b] = Math.min(graph[a][b], graph[a][k] + graph[k][b]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        // 결과 출력
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                // 도달할 수 없는 경우, INFINITY 출력
                if (graph[a][b] == INF) {
                    sb.append("INFINITY ");
                } else {
                    sb.append(graph[a][b]).append(" ");
                }
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}

/*
4
7
1 2 4
1 4 6
2 1 3
2 3 7
3 1 5
3 4 4
4 3 2
 */