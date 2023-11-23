package ThisIsCodingTest.first.dp.p223_바닥_공사;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private final static int[] d = new int[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        d[0] = 1;
        d[1] = 1;
        for (int i = 2; i <= n; i++) {
            d[i] = (d[i - 1] + d[i - 2] * 2) % 796796;
        }

        System.out.println(d[n]);
    }
}
