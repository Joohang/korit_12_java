package ch17_static.builders;

import lombok.ToString;

@ToString
public class Person {
    private String name;
    private int age;
    private String address;

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;

    }


    public static class Builder {
        private String name;
        private int age;
        private String address;

        /*
            그러면 class 내에 static class라고 하는 것을 정의했는데,
            Builder라고 하는 static 클래스 내에 field들을 정의했습니다.
            근데 클래스니까 field와 method들로 이루어져 있겠네요.
            이하는 method들을 정의하는 영역이 됩니다. 이하의 부분이 builder patter의 필수영역이 됩니다.
         */

        public Builder name(String name) {
            this.name = name;   // argument로 들어온  String data를 Builder의 field인 name에 대입
            return this;    // 그러면 name() 호출 전에는 field의 name에 값이 없다가 29번 코드라인
            // 시점에 name field에 값이 들어간 상태에서 Builder 클래스의 객체가 return됩니다.
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }
        /*
            field명과 동일한 메서드들을 이상에서 정의했습니다.
            그리고 메서드가 호출된 결과로 Builder 객체에 field 값이 대입된 상태된 후에
            그 객체가 return 되는 형태입니다.
         */
        public Person build()   {
            return new Person(this);
        }
    }
}
