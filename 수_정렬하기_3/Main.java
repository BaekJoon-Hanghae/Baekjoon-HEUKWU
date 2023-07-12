package 수_정렬하기_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] num = new int[10001];
        for (int i = 0; i < n; i++) {
            num[Integer.parseInt(br.readLine())]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < num.length; i++) {
            while (num[i] > 0) {
                sb.append(i).append("\n");
                num[i]--;
            }
        }

        System.out.println(sb);
    }
}
