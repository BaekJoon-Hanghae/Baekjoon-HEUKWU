package 단어_공부;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();

        int max = 0;
        char answer = ' ';

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        Iterator<Character> it = set.iterator();

        char[] a = new char[set.size()];
        for (int i = 0; i < a.length; i++) {
            a[i] = it.next();
        }

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (a[i] == s.charAt(j)) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                answer = a[i];
            } else if (count == max) {
                answer = '?';
            }
        }

        System.out.println(answer);
    }
}
