package ThisIsCodingTest.first.binary_search.p197_부품_찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] a = new int[1000001];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[Integer.parseInt(st.nextToken())]++;
        }

        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            if (a[Integer.parseInt(st.nextToken())] == 1) {
                sb.append("yes");
            } else {
                sb.append("no");
            }
            sb.append(" ");
        }

        System.out.println(sb);
    }
}
