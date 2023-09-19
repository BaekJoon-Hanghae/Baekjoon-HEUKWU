package ThisIsCodingTest.dijkstra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Dijkstra2 {

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
            graph.get(a).add(new Node2(b, c));
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
    public static ArrayList<ArrayList<Node2>> graph = new ArrayList<>(); // 각 노드에 연결되어 있는 노드
    public static int[] d = new int[100001]; // 최단 거리 테이블

    public static void dijkstra(int start) {
        PriorityQueue<Node2> q = new PriorityQueue<>();

        // 시작 노드로 가기 위한 최단 경로는 0으로 설정하여 큐에 삽입
        q.offer(new Node2(start, 0));
        d[start] = 0;

        while (!q.isEmpty()) {
            Node2 node = q.poll(); // 최단 거리가 가장 짧은 노드에 대한 정보
            int dist = node.getDistance(); // 현재 노드까지의 거리
            int now = node.getIndex(); // 현재 노드

            if (d[now] < dist) {
                continue; // 현재 노드가 이미 처리된 적이 있으면 continue
            }

            // 현재 노드와 연결된 다른 노드 확인
            for (int i = 0; i < graph.get(now).size(); i++) {
                int cost = d[now] + graph.get(now).get(i).getDistance();

                // 현재 노드를 거쳐서 다른 노드로 이동하는 거리가 더 짧은 경우
                if (cost < d[graph.get(now).get(i).getIndex()]) {
                    d[graph.get(now).get(i).getIndex()] = cost;
                    q.offer(new Node2(graph.get(now).get(i).getIndex(), cost));
                }
            }
        }
    }
}

class Node2 implements Comparable<Node2> {

    private final int index;
    private final int distance;

    public Node2(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public int getIndex() {
        return index;
    }

    public int getDistance() {
        return distance;
    }

    //거리가 짧은 것이 높은 우선순위를 가짐
    @Override
    public int compareTo(Node2 o) {
        return distance < o.getDistance() ? -1 : 1;
    }
}