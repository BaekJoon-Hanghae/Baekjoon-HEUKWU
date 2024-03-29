package level.지능형_기차_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int max = 0;
        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int exit = Integer.parseInt(st.nextToken());
            int enter = Integer.parseInt(st.nextToken());

            sum -= exit;
            sum += enter;

            max = Math.max(sum, max);
        }

        System.out.println(max);
    }
}
