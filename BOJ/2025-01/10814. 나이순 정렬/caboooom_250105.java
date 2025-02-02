import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Member> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] line = reader.readLine().split(" ");
            lst.add(new Member(Integer.parseInt(line[0]), line[1], i));
        }

        Collections.sort(lst);

        StringBuilder builder = new StringBuilder();
        for (Member member : lst) {
            builder.append(member).append("\n");
        }
        System.out.println(builder);
    }
}

class Member implements Comparable<Member> {
    int age;
    String name;
    int order;

    public Member(int age, String name, int order) {
        this.age = age;
        this.name = name;
        this.order = order;
    }

    @Override
    public int compareTo(Member o) {
        if (this.age == o.age) {
            return this.order - o.order;
        }
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return age + " " + name;
    }
}