package ch09_getter_setter.univ_student;

public class UnivStudentMain {
    public static void main(String[] args) {
        UnivStudent univStudent1 = new UnivStudent ( );
        univStudent1.setName("김일");
        univStudent1.setGrade(3);
        univStudent1.setScore(3.3);

        UnivStudent univStudent2 = new UnivStudent ( );
        univStudent2.setName("김이");
        univStudent2.setGrade(3);
        univStudent2.setScore(-30);

        UnivStudent univStudent3 = new UnivStudent ( );
        univStudent3.setName("김삼");
        univStudent3.setGrade(5);
        univStudent3.setScore(2.7);

        UnivStudent univStudent4 = new UnivStudent ( );
        univStudent4.setName("김사");
        univStudent4.setGrade(4);
        univStudent4.setScore(3.8);

        UnivStudent univStudent5 = new UnivStudent ( );
        univStudent5.setName("김오");
        univStudent5.setGrade(2);
        univStudent5.setScore(1.0);

        univStudent1.showInfo();
        univStudent2.showInfo();
        univStudent3.showInfo();
        univStudent4.showInfo();
        univStudent5.showInfo();

        // 생성자 내부에 로직을 작성한 예시

        UnivStudent student6 = new UnivStudent("김육",1,-100);
        System.out.println(student6.getName());    // 김육
        System.out.println(student6.getGrade());    // 1
        System.out.println(student6.getScore());    // 0.0






    }
}
