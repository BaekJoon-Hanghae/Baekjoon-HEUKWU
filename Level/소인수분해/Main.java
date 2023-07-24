package Level.소인수분해;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int i = 2;

        while (true) {
            if (n % i == 0) {
                System.out.println(i);
                n /= i;
            } else {
                i++;
            }
            if (n == 1) {
                break;
            }
        }
    }
}

// 해설
class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }

        if (n != 1) {
            System.out.println(n);
        }
    }
}