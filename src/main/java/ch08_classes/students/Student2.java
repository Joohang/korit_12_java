package ch08_classes.students;

public class Student2 {
    int studentCode;
    String name;
    double score;


    public Student2() {
    }

    public Student2(String name) {
        this.name = name;
    }

    public Student2(double score) {
        this.score = score;
    }

    public Student2(int studentCode) {
        this.studentCode = studentCode;
    }

    public Student2(int studentCode, String name) {
        this.studentCode = studentCode;
        this.name = name;
    }

    public Student2(int studentCode, String name, double score) {
        System.out.println("alt + ins로 만들어진 생성자입니다.");
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
    }
}
