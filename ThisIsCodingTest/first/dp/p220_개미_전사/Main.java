package ThisIsCodingTest.first.dp.p220_개미_전사;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static final int[] d = new int[101];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        d[1] = a[0];
        d[2] = Math.max(a[0], a[1]);
        for (int i = 3; i <= n; i++) {
            int c = i - 1;
            d[i] = Math.max(d[i - 1], d[i - 2] + a[c]);
        }

        System.out.println(d[n]);
    }
}
