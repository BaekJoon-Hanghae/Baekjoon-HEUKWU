package level.숫자의_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split("");
        int sum = 0;

        for (String s1 : s) {
            sum += Integer.parseInt(s1);
        }

        System.out.println(sum);
    }
}
