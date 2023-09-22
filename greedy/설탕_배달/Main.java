package greedy.설탕_배달;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < 5000; i++) {
            for (int j = 0; j < 5000; j++) {
                if (5 * i + 3 * j == n) {
                    answer = Math.min(answer, i + j);
                }
            }
        }

        if (answer == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }
    }
}
