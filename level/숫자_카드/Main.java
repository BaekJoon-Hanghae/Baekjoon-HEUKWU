package level.숫자_카드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[20000001];
        for (int i = 0; i < m; i++) {
            arr[Integer.parseInt(st.nextToken()) + 10000000]++;
        }

        int n = Integer.parseInt(br.readLine());
        StringTokenizer s = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[Integer.parseInt(s.nextToken()) + 10000000]).append(" ");
        }

        System.out.println(sb);
    }
}
