package 소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = b;

        for (int i = a; i <= b; i++) {
            if (num(i)) {
                sum += i;
                min = Math.min(min, i);
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    private static boolean num(int a) {
        int c = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                c++;
            }
        }

        return c == 2;
    }
}
