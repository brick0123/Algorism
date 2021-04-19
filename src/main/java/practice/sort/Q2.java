package practice.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    List<Student> students = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      String name = sc.next();
      int score = sc.nextInt();
      students.add(new Student(name, score));
    }

    Collections.sort(students);

    for (Student student : students) {
      System.out.println(student.getName());
    }
  }

}
class Student implements Comparable<Student> {

  private final String name;
  private final int score;

  public Student(String name, int score) {
    this.name = name;
    this.score = score;
  }

  public String getName() {
    return name;
  }

  public int getScore() {
    return score;
  }

  @Override
  public int compareTo(Student other) {
    return Integer.compare(this.score, other.getScore());
  }
}
