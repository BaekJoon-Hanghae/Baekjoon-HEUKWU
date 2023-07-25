package level.진법_변환;

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
        int c = 1;
        int sum = 0;

        for (int i = n.length() - 1; i >= 0; i--) {
            if (!('0' <= n.charAt(i) && n.charAt(i) <= '9')) {
                sum += c * (n.charAt(i) - 55);
            } else {
                sum += c * (n.charAt(i) - '0');
            }
            c *= b;
        }

        System.out.println(sum);
    }
}
