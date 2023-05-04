package 상수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        String a = s[0];
        String b = s[1];

        int x = Integer.parseInt(String.valueOf(a.charAt(2)) + a.charAt(1) + a.charAt(0));
        int y = Integer.parseInt(String.valueOf(b.charAt(2)) + b.charAt(1) + b.charAt(0));

        System.out.println(Math.max(x, y));
    }
}
