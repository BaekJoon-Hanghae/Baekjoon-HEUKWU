package level.설탕_배달;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        while (true) {
            if (n % 5 == 0) {
                System.out.println(n / 5 + count);
                break;
            } else if (n < 0) {
                System.out.println(-1);
                break;
            }
            n -= 3;
            count++;
        }
    }
}
