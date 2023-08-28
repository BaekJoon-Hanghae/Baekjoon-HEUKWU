package ThisIsCodingTest.sort.성적이_낮은_순서로_학생_출력하기.answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Student> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());

            list.add(new Student(name, score));
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (Student student : list) {
            sb.append(student.getName()).append(" ");
        }

        System.out.println(sb);
    }
}

class Student implements Comparable<Student> {

    private String name;
    private int score;

    public Student(String name, int sccore) {
        this.name = name;
        this.score = sccore;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        if (this.score < o.score) {
            return -1;
        }
        return 1;
    }
}
