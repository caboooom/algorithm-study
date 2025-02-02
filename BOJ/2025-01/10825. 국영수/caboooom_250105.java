import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Student> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            lst.add(new Student(tokenizer.nextToken(), Integer.parseInt(tokenizer.nextToken()),
                    Integer.parseInt(tokenizer.nextToken()), Integer.parseInt(tokenizer.nextToken())));
        }

        lst.sort(Comparator.comparing(Student::getKorean, Comparator.reverseOrder())
                .thenComparing(Student::getEnglish)
                .thenComparing(Student::getMath, Comparator.reverseOrder())
                .thenComparing(Student::getName));

        StringBuilder builder = new StringBuilder();
        for (Student student : lst) {
            builder.append(student).append("\n");
        }
        System.out.println(builder);
    }
}

class Student {
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
