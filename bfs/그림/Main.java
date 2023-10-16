package bfs.그림;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx;
    static int[] dy;
    static Queue<Pair> q;

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        visited = new boolean[n][m];
        q = new LinkedList<>();

        dx = new int[]{1, 0, -1, 0};
        dy = new int[]{0, 1, 0, -1};

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        int area = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graph[i][j] == 0 || visited[i][j]) {
                    continue;
                }
                count++;
                q.offer(new Pair(i, j));
                visited[i][j] = true;
                area = 0;
                while (!q.isEmpty()) {
                    Pair p = q.poll();
                    area++;
                    for (int k = 0; k < 4; k++) {
                        int nx = p.getX() + dx[k];
                        int ny = p.getY() + dy[k];

                        if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                            continue;
                        }

                        if (graph[nx][ny] == 1 && !visited[nx][ny]) {
                            q.offer(new Pair(nx, ny));
                            visited[nx][ny] = true;
                        }
                    }
                }
                if (area > max) {
                    max = area;
                }
            }

        }
        System.out.println(count);
        System.out.println(max);
    }

    public static class Pair{
        private int x;
        private int y;

        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }

        public int getX(){
            return x;
        }
        public int getY(){
            return y;
        }
    }
}