package ch15_object.teachers;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("안근수", "코리아아이티");
        Teacher teacher2 = new Teacher("안근수", "코리아아이티");

        System.out.println(teacher1);
        System.out.println(teacher2);

        boolean result1 = teacher1.equals(teacher2);
        System.out.println(result1);    // false 현재는....
        // 재정의하고 나니까 true로 바뀌어있습니다.

        /*
            이상의 코드에서 중요한 점은 재정의 전과 후가 결과값이 다르다는겁니다.
            Teacher 에서 .equals()를 재정의하기 전에는 false가 떴었습니다.
            그때는 teacher1과 teacher2의 주소지까지 확인하여 같은지 아닌지의 여부를 확인했다면
            재정의 이후에는 field에 입력된 데이터가 동일한지만을 체크하기 때문입니다.
         */

        Class tclass = teacher1.getClass();
        System.out.println(tclass); // 결과값 : class ch15_object.teachers.Teacher
        System.out.println(tclass.getSimpleName()); //결과값 : Teacher
        System.out.println(teacher1.getClass().getSimpleName());
        // 여러분들은 어느 수준까지는 그냥 작성할지, 아니면 너무 기니까 어느 부분은 잘라서
        // 변수에 대입할지 여러분 자체 성향 / 조직 성향에 따라 결정하셔야 합니다.

        Field [] fields = tclass.getDeclaredFields();
        //배열이네요, 그러면
        System.out.println(fields);  // 주소값만 나오겠네요.
        // 두 가지 방법으로 field를 확인할 수 있을 것 같습니다.
        // 1. 반복문 2 .Arrays
        for (int i = 0 ; i < fields.length ; i ++) {
            System.out.println("필드명 출력 " + fields[i].getName());
            System.out.println("패키지명 출력 + 클래스명 출력 " + fields[i].getType());
            System.out.println("클래스명 출력 " + fields[i].getType().getSimpleName());
        }
        // 이상에서 클래스 명에서 주의할 것은 Teacher라는 원본의 자료형이 아니라 field의 자료형을 의미합니다.

        System.out.println(Arrays.toString(fields));

        for (Field field : fields ) {
            System.out.println("필드명 출력 " + field.getName());
            System.out.println("패키지명 출력 + 클래스명 출력 " + field.getType());
            System.out.println("클래스명 출력 " + field.getType().getSimpleName());
        }
        Method[] methods = tclass.getDeclaredMethods();
        System.out.println(Arrays.toString(methods));
        for (Method method : methods) {
            System.out.println("메서드명 출력 " + method.getName());
            System.out.println("리턴 타입 " + method.getReturnType());
            System.out.println();
        }

        // 새로운 객체 만들겠습니다.
        ch15_object.Teacher teacher3 = new ch15_object.Teacher("안근수","코리아아이티");

        boolean result12 = teacher1.equals(teacher3);
        System.out.println(result12);
        /*
            teacher3의 자료형은 ch15_objects.Teacher이지
            ch15_object.teachers.Teacher가 아니기때문에 내부에 동일한 값이 들어가 있다고 하더라도
            false라는 결과값을 가지게 됩니다.
         */
    }

}
