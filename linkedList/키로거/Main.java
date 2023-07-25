package linkedList.키로거;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            LinkedList<Character> list = new LinkedList<>();
            ListIterator<Character> it = list.listIterator();

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);

                switch (c) {
                    case '<':
                        if (it.hasPrevious()) {
                            it.previous();
                        }
                        break;
                    case '>':
                        if (it.hasNext()) {
                            it.next();
                        }
                        break;
                    case '-':
                        if (it.hasPrevious()) {
                            it.previous();
                            it.remove();
                        }
                        break;
                    default:
                        it.add(c);
                }
            }

            StringBuilder sb = new StringBuilder();
            for (Character c : list) {
                sb.append(c);
            }

            System.out.println(sb);
        }
    }
}
