package ThisIsCodingTest.dijkstra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Dijkstra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        start = sc.nextInt();

        // 그래프 초기화
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // 모든 간선 정보 입력
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            // a 노드에서 b 노드로 가는 비용 = c
            graph.get(a).add(new Node(b, c));
        }

        // 최단 거리 테이블 모두 무한으로 초기화
        Arrays.fill(d, INF);

        // 다익스트라 알고리즘 수행
        dijkstra(start);

        // 모든 노드로 가기 위한 최단 거리 출력
        for (int i = 1; i <= n; i++) {
            //도달할 수 없는 경우, INFINITY 출력
            if (d[i] == INF) {
                System.out.println("INFINITY");
            } else {
                System.out.println(d[i]);
            }
        }
    }

    public static final int INF = (int) 1e9; // 10억
    public static int n; // 노드의 개수
    public static int m; // 간선의 개수
    public static int start; // 시작 노드 번호
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<>(); // 각 노드에 연결되어 있는 노드
    public static boolean[] visited = new boolean[100001]; // 방문한 적이 있는지 체크
    public static int[] d = new int[100001]; // 최단 거리 테이블

    public static int getSmallestNode() {
        int min_value = INF;
        int index = 0; // 가장 최단 거리가 짧은 노드

        for (int i = 1; i <= n; i++) {
            if (d[i] < min_value && !visited[i]) {
                min_value = d[i];
                index = i;
            }
        }

        return index;
    }

    public static void dijkstra(int start) {
        // 시작 노드 초기화
        d[start] = 0;
        visited[start] = true;

        for (int i = 0; i < graph.get(start).size(); i++) {
            d[graph.get(start).get(i).getIndex()] = graph.get(start).get(i).getDistance();
        }

        // 시작 노드를 제외한 노드에 대해 반복
        for (int i = 0; i < n - 1; i++) {
            int now = getSmallestNode();
            visited[now] = true; // 최단 거리가 가장 짧은 노드 방문 처리

            // 현재 노드와 연결된 다른 노드 확인
            for (int j = 0; j < graph.get(now).size(); j++) {
                int cost = d[now] + graph.get(now).get(j).getDistance();

                //현재 노드를 거쳐서 다른 노드를 이동하는 거리가 더 짧은 경우
                if (cost < d[graph.get(now).get(j).getIndex()]) {
                    d[graph.get(now).get(j).getIndex()] = cost;
                }
            }
        }
    }
}

class Node {

    private final int index;
    private final int distance;

    public Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public int getIndex() {
        return index;
    }

    public int getDistance() {
        return distance;
    }
}

/*
6 11
1
1 2 2
1 3 5
1 4 1
2 3 3
2 4 2
3 2 3
3 6 5
4 3 3
4 5 1
5 3 1
5 6 2
*/