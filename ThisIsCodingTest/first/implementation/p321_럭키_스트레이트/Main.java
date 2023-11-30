package ThisIsCodingTest.first.implementation.p321_럭키_스트레이트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String a = s.substring(0, s.length() / 2);
        String b = s.substring(s.length() / 2);

        int aSum = 0;
        for (int i = 0; i < a.length(); i++) {
            aSum += a.charAt(i) - '0';
        }

        int bSum = 0;
        for (int i = 0; i < a.length(); i++) {
            bSum += b.charAt(i) - '0';
        }

        if (aSum == bSum) {
            System.out.println("LUCKY");
            return;
        }

        System.out.println("READY");
    }
}
