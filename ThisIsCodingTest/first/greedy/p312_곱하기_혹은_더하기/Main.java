package ThisIsCodingTest.first.greedy.p312_곱하기_혹은_더하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] a = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            a[i] = s.charAt(i) - '0';
        }

        int sum = 0;
        for (int i : a) {
            if (sum <= 1 || i <= 1) {
                sum += i;
            } else {
                sum *= i;
            }
        }

        System.out.println(sum);
    }
}
