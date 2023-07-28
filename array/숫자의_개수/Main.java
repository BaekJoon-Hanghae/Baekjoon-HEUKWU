package array.숫자의_개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String s = String.valueOf(a * b * c);

        int[] arr = new int[10];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - '0']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i).append('\n');
        }

        System.out.println(sb);
    }
}
