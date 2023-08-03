package array.애너그램_만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();

        int[] num = new int[26];

        for (int i = 0; i < a.length(); i++) {
            num[a.charAt(i) - 97]++;
        }

        for (int i = 0; i < b.length(); i++) {
            num[b.charAt(i) - 97]--;
        }

        int sum = 0;
        for (int i : num) {
            sum += Math.abs(i);
        }

        System.out.println(sum);
    }
}
