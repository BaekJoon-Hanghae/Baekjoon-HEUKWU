package level.악마의_제안;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        long a = Long.parseLong(split[0]);
        long b = Long.parseLong(split[1]);

        if (b == 1) {
            System.out.println(-1);
        } else if ((a * b) % (b - 1) != 0) {
            System.out.println((a * b) / (b - 1) + 1);
        } else {
            System.out.println((a * b) / (b - 1));
        }
    }
}
