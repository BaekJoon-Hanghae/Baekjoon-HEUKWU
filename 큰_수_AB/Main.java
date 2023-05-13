package 큰_수_AB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        BigInteger a = new BigInteger(s.nextToken());
        BigInteger b = new BigInteger(s.nextToken());

        System.out.println(a.add(b));
    }
}