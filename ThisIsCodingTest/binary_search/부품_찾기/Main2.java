package ThisIsCodingTest.binary_search.부품_찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[1000001];
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            arr[x] = 1;
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] targets = new int[m];
        for (int i = 0; i < m; i++) {
            targets[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            if (arr[targets[i]] == 1) {
                sb.append("yes ");
            } else {
                sb.append("no ");
            }
        }

        System.out.println(sb);
    }
}
