package ThisIsCodingTest.first.dp.p226_효율적인_화폐_구성;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] d = new int[m + 1];
        Arrays.fill(d, 10001);

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        d[0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = a[i]; j <= m; j++) {
                if (d[j - a[i]] != 10001) {
                    d[j] = Math.min(d[j], d[j - a[i]] + 1);
                }
            }
        }

        if (d[m] != 10001) {
            System.out.println(d[m]);
            return;
        }

        System.out.println(-1);
    }
}
