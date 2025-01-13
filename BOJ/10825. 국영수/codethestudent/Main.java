import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static class Student implements Comparable<Student> {
        String name;
        int lang;
        int english;
        int math;

        public Student(String name, int lang, int english, int math) {
            this.name = name;
            this.lang = lang;
            this.english = english;
            this.math = math;
        }

        @Override
        public int compareTo(Main.Student o) {
            // 음수이면 -> 1번째 인자가 앞에 
            // 양수이면 -> 2번째 인자가 앞에
            if (o.lang != this.lang) {
                return Integer.compare(o.lang, this.lang);
            }
            if (this.english != o.english) {
                return Integer.compare(this.english, o.english);
            }
            if (this.math != o.math) {
                return Integer.compare(o.math, this.math);
            }
            return this.name.compareTo(o.name);
        }

    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            List<Student> students = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                String[] info = br.readLine().split(" ");
                students.add(new Student(info[0], Integer.parseInt(info[1]), Integer.parseInt(info[2]),
                        Integer.parseInt(info[3])));
            }

            Collections.sort(students);

            for (Student s : students) {
                System.out.println(s.name);
            }

            // // 감소해야한다 -> 큰수 ~ 작은수
            // // 증가해야한다 -> 작은수 ~ 큰수
            // Student student1 = new Student("asdf", 1, 1, 1);
            // Student student2 = new Student("asdf", 1, 1, 2);
            // System.out.println(student1.compareTo(student2));
        }
    }
}
