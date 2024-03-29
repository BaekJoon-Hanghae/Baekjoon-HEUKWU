package codingtest.bronze1.진법_변환2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int a = n % b;
            if (a > 9) {
                sb.append((char) (a + 55));
            } else {
                sb.append(a);
            }
            n /= b;
        }

        System.out.println(sb.reverse());
    }
}
