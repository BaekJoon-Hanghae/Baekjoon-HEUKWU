package codingtest.bronze2.진법_변환;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        int sum = 0;
        for (int i = n.length() - 1; i >= 0; i--) {
            int c = n.charAt(n.length() - 1 - i) - '0';
            c = 0 <= c && c <= 9 ? c : c - 7;
            sum += c * Math.pow(b, i);
        }

        System.out.println(sum);
    }
}
