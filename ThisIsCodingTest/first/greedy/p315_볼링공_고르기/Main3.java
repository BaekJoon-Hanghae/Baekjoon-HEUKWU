package ThisIsCodingTest.first.greedy.p315_볼링공_고르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] balls = new int[11];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            balls[Integer.parseInt(st.nextToken())]++;
        }

        int sum = 0;
        for (int i = 0; i < m; i++) {
            n -= balls[i];
            sum += n * balls[i];
        }

        System.out.println(sum);
    }
}
