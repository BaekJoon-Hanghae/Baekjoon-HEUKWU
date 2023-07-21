package 피보나치_수_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(finbonacci(Integer.parseInt(br.readLine())));
    }

    private static int finbonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return finbonacci(n - 1) + finbonacci(n - 2);
    }
}
