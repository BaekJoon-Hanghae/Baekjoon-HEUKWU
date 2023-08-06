
package ThisIsCodingTest.greedy.숫자_카드_게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int max = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < m; j++) {
                min = Math.min(min, Integer.parseInt(st.nextToken()));
            }

            max = Math.max(max, min);
        }

        System.out.println(max);
    }
}
