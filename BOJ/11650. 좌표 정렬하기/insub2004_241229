package BOJ.정렬.좌표정렬하기_11650;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        List<Coordinate> coodrdinateList = new ArrayList<>();
        for (int i = 0; i < cnt; i++) {
            coodrdinateList.add(new Coordinate(sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(coodrdinateList);

        for (Coordinate coordinate : coodrdinateList) {
            System.out.println(coordinate);
        }
    }

    static class Coordinate implements Comparable<Coordinate> {

        private int x;
        private int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Coordinate coordinate) {
            if (this.x == coordinate.x) {
                return this.y - coordinate.y;
            }

            return this.x - coordinate.x;
        }


        @Override
        public String toString() {
            return x + " " + y;
        }
    }

}

