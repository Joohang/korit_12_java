package ch17_static.builders;

public class PersonMain {
    public static void main(String[] args) {
//        Person person = new Person();
        /*
            private person(Builder builder)로 정의한 매개변수 생성자민 있으니 기본 생성자가 없다는
            점에서 오류 발생.
            그리고 private 접근 제어자이기 때문에 () 내에 builder 객체를 집어놓는다고 하더라도
            오류 발생

            혹시 AllArgsConstructor 형태로 작성한다면
         */
//        Person person = new Person("김일" , 20 , "서울 특별시 종로구" );
        // 이상의 AllArgsConstructor를 Builder 패턴을 적용하여 객체 생성을 해보겠습닏다.
        // 필드 순서를 다르게 집어넣었는데도 만들어졌네요.
        Person person1 = new Person.Builder().age(21).address("부산광역시 부산진구").name("김일").build();
        System.out.println(person1);

        // Builder 패턴을 활용한 NoArgsConstructor
        Person person2 = new Person.Builder().build();
        System.out.println(person2);

        Person person3 = new Person.Builder().name("김삼").build();
        System.out.println(person3);


        Person2 person4 = Person2.builder().name("김사").build();
        System.out.println(person4);
        Person2 person5 = Person2.builder().build();
        System.out.println(person5);

        Person2 person6 = Person2.builder().name("김육").age(26).address("광주광역시 북구").build();
        System.out.println(person6);

    }
}
