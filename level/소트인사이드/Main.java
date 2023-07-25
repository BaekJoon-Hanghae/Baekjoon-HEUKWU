package level.소트인사이드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("");

        int[] a = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            a[i] = Integer.parseInt(s[i]);
        }

        Arrays.sort(a);

        StringBuilder sb = new StringBuilder();
        for (int i = a.length - 1; i >= 0; i--) {
            sb.append(a[i]);
        }

        System.out.println(sb);
    }
}
