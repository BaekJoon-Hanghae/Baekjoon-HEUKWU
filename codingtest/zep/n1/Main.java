package codingtest.zep.n1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<Line> moved = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final Dot start = new Dot(5, 5);
        final String line = br.readLine();
        Dot now = start;
        for (int i = 0; i < line.length(); i++) {
            now = moving(line, i, now);
        }
        moving(line, 0, start);
        System.out.println(moved.size());
    }

    private static Dot moving(final String command, final int index, final Dot now) {
        if (command.length() == index) {
            return now;
        }
        final char move = command.charAt(index);
        final Dot movement;
        switch (move) {
            case 'U':
                movement = new Dot(0, 1);
                break;
            case 'D':
                movement = new Dot(0, -1);
                break;
            case 'R':
                movement = new Dot(1, 0);
                break;
            case 'L':
                movement = new Dot(-1, 0);
                break;
            default:
                throw new IllegalArgumentException();
        }
        final Dot next = now.moveTo(movement);
        final Line nowLine = new Line(now, next);
        if (nowLine.isNotInMoved()) {
            moved.add(nowLine);
        }
        return next;
//        return moving(command, index + 1, next);
    }

    private static class Dot {
        public final int x;
        public final int y;

        private Dot(int x, int y) {
            this.x = x;
            this.y = y;
        }

        Dot moveTo(final Dot movement) {
            final int nextX = this.x + movement.x;
            final int nextY = this.y + movement.y;

            final int max = 9;
            final int min = 0;
            if (nextX < min || nextY < min || nextX > max || nextY > max) {
                return this;
            }
            return new Dot(nextX, nextY);
        }

        @Override
        public boolean equals(Object o) {
            Dot dot = (Dot) o;
            return x == dot.x && y == dot.y;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    private static class Line {
        public final Dot dot1;
        public final Dot dot2;

        private Line(Dot dot1, Dot dot2) {
            this.dot1 = dot1;
            this.dot2 = dot2;
        }

        boolean isNotInMoved() {
            if (this.dot1.equals(this.dot2)) {
                return false;
            }
            boolean isNotIn = true;
            for (Line oneMoved : moved) {
                final Dot dot1 = oneMoved.dot1;
                final Dot dot2 = oneMoved.dot2;
                if (dot1.equals(this.dot1) && dot2.equals(this.dot2)) {
                    isNotIn = false;
                    break;
                }
                if (dot1.equals(this.dot2) && dot2.equals(this.dot1)) {
                    isNotIn = false;
                    break;
                }
            }
            return isNotIn;
        }

        @Override
        public String toString() {
            return "Line{" +
                    "dot1=" + dot1 +
                    ", dot2=" + dot2 +
                    '}';
        }
    }
}
