package BOJ.정렬.나이순정렬_10814.insub2004_250105;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        List<Person> list = new ArrayList<>();
        for (int i = 0; i < cnt; i++) {
            String[] strings = br.readLine().split(" ");
            list.add(new Person(Integer.parseInt(strings[0]), strings[1]));
        }

        list.sort(null);

        for (int i = 0; i < list.size(); i++) {
            Person p = list.get(i);
            System.out.println(p);
        }
    }

}

class Person implements Comparable<Person>{
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }

    @Override
    public int compareTo(Person o) {
        return this.getId() < o.getId() ? -1 : (this.getId() == o.getId() ? 0 : 1);
    }
}