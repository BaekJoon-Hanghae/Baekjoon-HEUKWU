package ThisIsCodingTest.dynamic_programming.개미_전사;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] a = new int[n];
        int[] d = new int[100];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        d[0] = a[0];
        d[1] = Math.max(a[0], a[1]);

        for (int i = 2; i < n; i++) {
            d[i] = Math.max(d[i - 1], d[i - 2] + a[i]);
        }

        System.out.println(Arrays.toString(d));

        System.out.println(d[n - 1]);
    }
}
