package level.이진수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            String s = Integer.toBinaryString(Integer.parseInt(br.readLine()));
            for (int j = s.length() - 1; j >= 0; j--) {
                if (s.charAt(j) == '1') {
                    sb.append(s.length() - 1 - j).append(" ");
                }
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
