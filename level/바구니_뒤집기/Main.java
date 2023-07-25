package level.바구니_뒤집기;

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

        int[] baskets = new int[n + 1];
        for (int i = 0; i < baskets.length; i++) {
            baskets[i] = i;
        }

        StringTokenizer st2;
        for (int i = 0; i < m; i++) {
            st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());

            while (a < b) {
                int tmp = baskets[a];
                baskets[a++] = baskets[b];
                baskets[b--] = tmp;
            }
        }

        for (int i = 1; i < baskets.length; i++) {
            System.out.print(baskets[i] + " ");
        }
    }
}
