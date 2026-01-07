package ch13_abstraction;

public class Student extends Person {
    //서브 클래스의 field 선언
    private String school;

    public Student(String name) {

        super(name);
    }

    public Student(String name, String school) {
        super(name);
        this.school = school;
    }

    @Override
    public void introduce() {
        
    }
}
