package Level.코딩은_체육과목_입니다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder s = new StringBuilder();

        int n = (Integer.parseInt(br.readLine()) - 4) / 4;

        s.append("long ".repeat(Math.max(0, n))).append("long int");
        System.out.println(s);
    }
}
