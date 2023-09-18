package ThisIsCodingTest.dynamic_programming.효율적인_화폐_구성;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] money = new int[n];
        for (int i = 0; i < n; i++) {
            money[i] = Integer.parseInt(br.readLine());
        }

        int[] d = new int[m + 1];
        Arrays.fill(d, 10001);

        d[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = money[i]; j <= m; j++) {
                if (d[j - money[i]] != 10001) {
                    d[j] = Math.min(d[j], d[j - money[i]] + 1);
                }
            }
        }

        if (d[m] == 10001) {
            System.out.println(-1);
        } else {
            System.out.println(d[m]);
        }
    }
}
