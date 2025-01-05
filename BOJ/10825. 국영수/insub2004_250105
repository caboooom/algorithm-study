package BOJ.정렬.국영수_10825.insub2004_250105;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        List<Student> list = new ArrayList<>();
        for (int i = 0; i < cnt; i++) {
            String[] strings = br.readLine().split(" ");
            list.add(new Student(strings[0],Integer.parseInt(strings[1]),Integer.parseInt(strings[2]),Integer.parseInt(strings[3])));
        }

        list.sort(Comparator.comparing(Student::getKorean, Comparator.reverseOrder())
                .thenComparing(Student::getEnglish)
                .thenComparing(Student::getMath, Comparator.reverseOrder())
                .thenComparing(Student::getName));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}

class Student{

    String name;
    int korean;
    int english;
    int math;

    public Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public int getKorean() {
        return korean;
    }

    public int getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }

    @Override
    public String toString() {
        return name;
    }
}