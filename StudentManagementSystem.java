import java.io.*;
import java.util.ArrayList;

class Student {
    String name;
    int age;
    String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return name + "-" + age + "-" + course;
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Danish", 20, "Java"));
        students.add(new Student("Rahul", 21, "Python"));
        students.add(new Student("Priya", 19, "Data Science"));
        students.add(new Student("Amit", 22, "Web Development"));
        students.add(new Student("Sneha", 20, "Machine Learning"));

        String fileName = "student-data.txt";

        try {
            FileWriter fw = new FileWriter(fileName);

            for (Student s : students) {
                fw.write(s.toString() + "\n");
            }

            fw.close();
            System.out.println("Student data written successfully.\n");

            System.out.println("Student Data from File:");
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}