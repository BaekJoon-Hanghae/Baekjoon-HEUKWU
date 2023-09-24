package greedy.전자레인지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[] time = {300, 60, 10};
        StringBuilder sb = new StringBuilder();
        for (int j : time) {
            sb.append(t / j).append(" ");
            t %= j;
        }

        if (t == 0) {
            System.out.println(sb);
        } else {
            System.out.println(-1);
        }
    }
}
