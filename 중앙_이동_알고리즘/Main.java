package 중앙_이동_알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = 2;

        for (int i = 0; i < n; i++) {
            a = 2 * a - 1;
        }

        System.out.println(a * a);
    }
}
