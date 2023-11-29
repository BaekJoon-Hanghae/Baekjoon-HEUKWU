package ThisIsCodingTest.first.greedy.p314_만들_없는_금액;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] coins = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(coins);

        int target = 1;
        for (int coin : coins) {
            if (target < coin) {
                break;
            }

            target += coin;
        }

        System.out.println(target);
    }
}
