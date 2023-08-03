package array.Strfry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            int[] num = new int[26];
            for (int j = 0; j < a.length(); j++) {
                num[a.charAt(j) - 97]++;
            }

            for (int j = 0; j < b.length(); j++) {
                num[b.charAt(j) - 97]--;
            }

            boolean is = true;
            for (int j : num) {
                if (j != 0) {
                    is = false;
                    break;
                }
            }

            if (is) {
                sb.append("Possible");
            } else {
                sb.append("Impossible");
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
