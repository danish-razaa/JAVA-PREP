import java.util.*;

class Course {
    private String courseName;
    private int credit;

    public Course(String courseName, int credit) {
        this.courseName = courseName;
        this.credit = credit;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredit() {
        return credit;
    }

    @Override
    public String toString() {
        return courseName + "(" + credit + " credits)";
    }
}

abstract class Student {
    protected String name;
    protected int age;
    protected ArrayList<Course> courses;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        courses = new ArrayList<>();
    }

    public int getTotalCredits() {
        int total = 0;
        for (Course c : courses) {
            total += c.getCredit();
        }
        return total;
    }

    public abstract void enrollCourse(Course course);

    public void enrollCourse(String courseName, int credit) {
        enrollCourse(new Course(courseName, credit));
    }

    public abstract void printTotalCredits();

    public ArrayList<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", Age: " + age +
                ", Courses: " + courses +
                ", Total Credits: " + getTotalCredits();
    }
}

class PartTimeStudent extends Student {

    public PartTimeStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public void enrollCourse(Course course) {
        if (getTotalCredits() + course.getCredit() < 10) {
            courses.add(course);
        } else {
            System.out.println(name +
                    " cannot enroll in " +
                    course.getCourseName() +
                    " (Part-time credit limit exceeded)");
        }
    }

    @Override
    public void printTotalCredits() {
        System.out.println(name +
                " (Part-Time) Total Credits: " +
                getTotalCredits());
    }
}

class FullTimeStudent extends Student {

    public FullTimeStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public void enrollCourse(Course course) {
        if (getTotalCredits() + course.getCredit() <= 20) {
            courses.add(course);
        } else {
            System.out.println(name +
                    " cannot enroll in " +
                    course.getCourseName() +
                    " (Maximum 20 credits exceeded)");
        }
    }

    @Override
    public void printTotalCredits() {
        if (getTotalCredits() < 10) {
            System.out.println(name +
                    " (Full-Time) has less than minimum required credits.");
        } else {
            System.out.println(name +
                    " (Full-Time) Total Credits: " +
                    getTotalCredits());
        }
    }
}

public class StudentManagementDemo {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        Student s1 = new PartTimeStudent("Danish", 20);
        Student s2 = new FullTimeStudent("Rahul", 21);
        Student s3 = new PartTimeStudent("Priya", 19);
        Student s4 = new FullTimeStudent("Amit", 22);
        Student s5 = new PartTimeStudent("Sneha", 20);
        Student s6 = new FullTimeStudent("Rohit", 23);
        Student s7 = new PartTimeStudent("Neha", 18);
        Student s8 = new FullTimeStudent("Karan", 21);
        Student s9 = new PartTimeStudent("Anjali", 20);
        Student s10 = new FullTimeStudent("Vikas", 22);

        students.addAll(Arrays.asList(
                s1, s2, s3, s4, s5,
                s6, s7, s8, s9, s10));

        s1.enrollCourse("Maths", 3);
        s1.enrollCourse("Java", 4);

        s2.enrollCourse("Maths", 5);
        s2.enrollCourse("Python", 5);
        s2.enrollCourse("DBMS", 4);

        s3.enrollCourse("Maths", 3);
        s3.enrollCourse("Java", 4);

        s4.enrollCourse("Python", 5);
        s4.enrollCourse("DBMS", 5);
        s4.enrollCourse("AI", 5);

        s5.enrollCourse("Java", 4);

        s6.enrollCourse("Maths", 5);
        s6.enrollCourse("AI", 5);

        s7.enrollCourse("Python", 3);

        s8.enrollCourse("DBMS", 5);
        s8.enrollCourse("Java", 5);

        s9.enrollCourse("Maths", 3);

        s10.enrollCourse("AI", 5);
        s10.enrollCourse("Python", 5);

        
        System.out.println("===== STUDENT DETAILS =====");
        for (Student s : students) {
            System.out.println(s);
            s.printTotalCredits();
            System.out.println();
        }

        
        HashMap<String, ArrayList<String>> courseStudents =
                new HashMap<>();

        for (Student s : students) {
            for (Course c : s.getCourses()) {

                courseStudents.putIfAbsent(
                        c.getCourseName(),
                        new ArrayList<>());

                courseStudents.get(
                        c.getCourseName())
                        .add(s.name);
            }
        }

        
        System.out.println("===== COURSEWISE STUDENTS =====");

        for (Map.Entry<String,
                ArrayList<String>> entry :
                courseStudents.entrySet()) {

            System.out.println(
                    entry.getKey() +
                    " -> " +
                    entry.getValue());
        }
    }
}