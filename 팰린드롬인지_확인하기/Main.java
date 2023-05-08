package 팰린드롬인지_확인하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String s1 = s.substring(0, s.length() / 2);
        String s2;

        if (s.length() % 2 == 0) {
            s2 = s.substring(s.length() / 2);
        } else {
            s2 = s.substring(s.length() / 2 + 1);
        }
        isSame(s1, s2);
    }

    static void isSame(String s1, String s2) {
        String s3 = "";
        for (int i = s2.length() - 1; i >= 0; i--) {
            s3 += s2.charAt(i);
        }

        if (s1.equals(s3)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
