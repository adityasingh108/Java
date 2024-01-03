import java.util.Arrays;
import java.util.Scanner;

class Student {
    private int rollNo;
    private String name;
    private String subject;
    private char grade;
    private String date;

    public Student(int rollNo, String name, String subject, char grade, String date) {
        this.rollNo = rollNo;
        this.name = name;
        this.subject = subject;
        this.grade = grade;
        this.date = date;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

class Solution {
    public static Student[] findStudentByGradeAndMonth(Student[] students, char grade, int month) {
        String monthStr = String.format("%02d", month);

        Student[] result = Arrays.stream(students)
                .filter(s -> s.getGrade() == grade && s.getDate().substring(3, 5).equals(monthStr))
                .sorted((s1, s2) -> Integer.compare(s1.getRollNo(), s2.getRollNo()))
                .toArray(Student[]::new);

        return result.length > 0 ? result : null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading input
        int n = 4; // Number of students
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            int rollNo = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            String name = sc.nextLine();
            String subject = sc.nextLine();
            char grade = sc.nextLine().charAt(0);
            String date = sc.nextLine();

            students[i] = new Student(rollNo, name, subject, grade, date);
        }

        char searchGrade = sc.nextLine().charAt(0);
        int searchMonth = sc.nextInt();

        // Finding students and printing the result
        Student[] result = findStudentByGradeAndMonth(students, searchGrade, searchMonth);

        if (result != null) {
            for (Student student : result) {
                System.out.println(student.getName());
                System.out.println(student.getSubject());
            }
            System.out.println(result.length);
        } else {
            System.out.println("No student found");
        }

        sc.close();
    }
}
