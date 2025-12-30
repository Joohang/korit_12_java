package ch01_variable;
/*
    주석(comment) : Java 프로그램의 경우 폴더 및 파일의 전체 코드를 컴파일링
        하는데, 거기서 오류가 하나라도 발생하게 되면 전체 프로그램이 실행 x.
        하지만 주석 처리를 한 부분에 대해서는 컴퓨터가 코드로 인지하지 않기
        때문에 오류가 발생하지 않습니다.

        즉, 주석이란 컴퓨터가 읽어서 처리하는 부분이 아니라 사람이 읽어서
            정보를 얻을 수 있는 것에 의의가 있습니다.
        1) 한 줄 주석 : //
        2) 다중 주석 : / + shift + 8 + enter
        3) 사후 주석 : 주석 처리할 부분의 코드 라인에 ctrl + /
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("안녕하세요.");
        System.out.println(1);
        System.out.println('1');
        System.out.println("1");
        /*
            이상과 같은 방식의 코드 대입(매번 데이터를 직접 사용하는 방식) 방식을 '하드 코딩'
            이라고 합니다.
            하드 코딩 : 명령문에 데이터(변수에 대입되지 않은 데이터인데 이를 리터럴(literal))를
                바로 집어넣는 것으로, '지양'되는 방식.

            그렇다면 권장되는 방식은 ? 데이터를 '변수'에 대입하고, 변수를 통해서 명령을 내리는 방식

            변수(variable) : 데이터를 담는 바구니 -> 근데 그 바구니에 이름을 지어줘야 함.
            변수 선언 방법 :
            자료형 변수명 = 데이터;
         */
        int scoreEnglish = 100;     // 변수 선언 및 초기화
        System.out.println(scoreEnglish);
        int scoreKorean;            // 변수 선언
        scoreKorean = 99;           // 초기화
        System.out.println(scoreKorean);
        scoreEnglish = 50;          // 변수에 데이터를 재대입

        String introduction = "안녕하세요, 저는 이번 국비 과정을 맡게 된 안근수입니다.";
        System.out.println(introduction + " 앞으로 잘 부탁드립니다.");
        // 이상의 명령어는 변수 + 하드코딩된 데이터로 이루어져있음.
        /*
            Java에서의 변수 명명 규칙 :
                1. 카멜 표기법(camel case) 사용
                    : 첫 문자는 소문자로 시작 / 복수의 단어로 이루어졌을 경우 두 번째 단어의
                        첫 번째 문자만 대문자
                    ex) 한 단어 짜리 : result
                    ex) 복수 단어 : myTestResult
                2. 특수문자 지양

                cf) python 학습 하신 분들의 경우 python 변수 표기 방식은 스네이크 표기법(snake case)
                    라고 해서 my_test_result와 같은 방식으로 작성합니다.
         */
        // 변수 : 값이 바뀔 수 있음.
        System.out.println("국어 점수(변경전) : " + scoreKorean);
        scoreKorean = 100;          // 재대입할 때는 자료형을 명시하지 않는다.
        System.out.println("국어 점수(변경후) : " + scoreKorean);

        // 자료형 수업
        // 1. 논리 자료형(boolean) 변수 : 참 / 거짓(true/ false)
        // 자료형 변수명 = 데이터(값);        변수의 선언 및 초기화
        boolean checkFlag1 = false;        // 변수의 선언 및 초기화
        checkFlag1 = true;                 // 재대입

        // 2. '문자' 자료형 변수
        char name1 = '안';
        char name2 = '근';
        char name3 = '수';

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);  // print의 경우 변수의 자료형을 따라감.

        System.out.println(name1 + name2 + name3);  // 결과값 : 144732
        // 근데 74 라인의 경우에 변수의 자료형이 char인데 문자가 여러 개 나오는 바람에 결과값이
        // 의도한대로 나오지 않음.
        System.out.println("" + name1 + name2 + name3); // 결과값 : 안근수

        System.out.print(name1);
        System.out.print(name2);
        System.out.print(name3);
        System.out.println();
        /*
            이상의 코드에서 알 수 있는 것처럼 컴퓨터는 생각보다 멍청합니다.
            개발자인 저희가 하나하나 지정을 해줄 필요가 있습니다.
            '문자'와 '문자열'은 서로 다른 개념인데,
            문자(하나짜리)를 세 번 더했을 경우 더 이상 문자가 아니라 문자열로 인식되기 때문에
            원하는 방식으로 출력되지 않습니다.

            그렇기 때문에 sout() 내부에 ""를 넣어주니까, 컴퓨터는 얘가 문자열이라고 생각하고
            원하는 결과값을 만들어줬습니다.

            즉
            작은따옴표('')는 '문자'를 표시하기 위한 기호
            큰따옴표("")는 "문자열"을 표시하기 위한 기호라고 알아두면 되겠습니다.

            그리고, sout()의 () 내부에서 가장 먼저 나온 데이터의 자료형을 따라간다는 점도
            확인할 수 있습니다.

            현재 학습한 부분 : boolean / char / String
                참고 : int - integer의 축약어로 "정수"를 의미함.

            과제 : name1, name2, name3에 여러분들의 이름을 한글자씩 각각 대입하여
                ctrl + f10을 눌렀을 경우에
                김일이
                라고 출력될 수 있도록 작성하시오.
                그리고 한 줄 더 추가하시오.
                안녕하세요 제 이름은 김일이입니다.
                참고 : 제 깃허브 아이디 : maybeags
                실행 예
                김일이
                안녕하세요 제 이름은 김일이입니다.
         */
        name1 = '김';
        name2 = '일';
        name3 = '이';
        // 풀이 1
        System.out.println("" + name1+ name2+ name3);
        // 풀이 2
        System.out.print(name1);
        System.out.print(name2);
        System.out.print(name3);    // print는 끝나고 개행(enter키)되지 않습니다.
        System.out.println("안녕하세요 제 이름은 " + name1+ name2+ name3 + "입니다.");

        // 3. 정수 자료형 변수 (int)
        int width1 = 100;
        int width2 = 200;
        System.out.println(width1 + width2);    // 숫자 자료형은 연산이 가능합니다.
        String width3 = "100";
        String width4 = "200";
        System.out.println(width3 + width4);    // 결과값 : 100200
        String name4 = "안";
        String name5 = "근수";
        System.out.println(name4 + name5);      // 결과값 : 안근수
        System.out.println(width1 - width2);    // 결과값 : -100
//        System.out.println(width3 - width4);  - 문자열 자료형의 경우 + 연산만 가능.
        System.out.println(width2 + width1);    // 300
        System.out.println(width4 + width3);    // 결과값 : 200100
        // 정확하게 말하면 문자열에서의 + 연산은 수학적 연산이 아니라 "나열"됩니다.

        Integer width5 = 500;
        Integer width6 = 600;
        System.out.println(width5 + width6);    // 결과값 : 1100
        // 자료형 int 뿐만 아니라 대문자로 시작되는 자료형인 Integer가 있긴 합니다(추후 학습)

        // 4. 실수 자료형 double
        double pi = 3.1415926;
        //int pi2 = 3.14; // 오류 발생
        // 5. 정수 자료형 long / 실수 자료형 float

        // ch02_operator 패키지 생성 Operator01 자바 파일(클래스) 생성
    }
}
