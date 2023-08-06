package ThisIsCodingTest.greedy.l이_될_때까지.answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int count = 0;

        while (true) {
            int target = n / k * k;
            count += (n - target);
            n = target;

            if (n < k) {
                break;
            }

            count++;
            n /= k;
        }

        count += (n - 1);
        System.out.println(count);
    }
}
