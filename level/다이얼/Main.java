package level.다이얼;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('A' <= c && c <= 'C') {
                count += 3;
            } else if ('D' <= c && c <= 'F') {
                count += 4;
            } else if ('G' <= c && c <= 'I') {
                count += 5;
            } else if ('J' <= c && c <= 'L') {
                count += 6;
            } else if ('M' <= c && c <= 'O') {
                count += 7;
            } else if ('P' <= c && c <= 'S') {
                count += 8;
            } else if ('T' <= c && c <= 'V') {
                count += 9;
            } else if ('W' <= c && c <= 'Z') {
                count += 10;
            } else {
                count += 11;
            }
        }

        System.out.println(count);
    }
}
