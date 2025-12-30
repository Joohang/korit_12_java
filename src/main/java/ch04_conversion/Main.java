package ch04_conversion;

public class Main {
    public static void main(String[] args) {
        // 1. upcasting(업캐스팅) : 더 큰 용량의 자료형으로 변환시키는 것.

        // 변수 선언 및 초기화
        // 자료형 변수명 = 데이터;
        char cast1 = 'A';
        System.out.println("원형 : " + cast1);
        // 업캐스팅 방법 # 1
        // 형 변환을 하기 위해서는 '(바꿀데이터타입) 변수명'으로 작성하시면 됩니다.
        System.out.println("변형 : " + (int)cast1);   // 결과값 : 65
        // 시험에 자주 나옴.
        System.out.println(cast1);

        char cast2 = 'a';
        System.out.println("원형 : " + cast2);
        System.out.println("변형 : " + (int)cast2);   // 결과값 : 97

        // 업캐스팅 방법 # 2
        // 새로운 변수를 선언하여 캐스팅이 이루어진 데이터를 집어넣는 방법
        char cast3 = 'b';
        int casted3 = cast3;    // 여기는 (int)라고 쓰이지 않았죠.
        System.out.println("원형 : " + cast3);
        System.out.println("변형 : " + casted3);

        // 이상의 경우에는 변수를 선언할 때 변경되기를 원하는 자료형으로 명시해줍니다.

        // 다운캐스팅 : 용량이 더 작은 자료형으로 변형하는 것을 의미
        int cast4 = 99;     // 얘는 # 1 방법으로
        int cast5 = 100;    // 얘는 # 2로 하시오
        // 지시 사항 다운캐스팅하는 방법을 업캐스팅 방법 # 1 ,2를 참조하여
        // char형으로 바꾼 후 콘솔창에 원형과 변형을 모두 출력하시오.

        // 참고 : 어딘가에서 오류가 발생하는데 그건 정상일 수 있습니다.
        // 다운캐스팅 # 1 활용
        System.out.println("원형 : " + cast4);
        System.out.println("변형 : " + (char)cast4);
        // 다운캐스팅 # 2 활용
        char casted5 = (char) cast5;
        System.out.println("원형 : " + cast5);
        System.out.println("변형 : " + casted5);
        /*
            이상의 코드에서 처음에 41 번 라인을 업캐스팅 # 2 방식으로 처리하려고 했을 때,
            오류가 나는 것은 당연한 부분입니다.
            추후 수업에서 더 중요하게 적용되는 개념인데, 업캐스팅의 경우 메모리 용량이
            커지면 되니까 기존 데이터의 변형이 일어날 가능성이 없어서 암시적(implicit)으로
            변형이 가능한 반면,
            다운캐스팅의 경우 데이터 용량이 축소되는 과정에서 변수가 메모리 용량을 벗어나게
            되는 경우가 있습니다(어제 예를 들었던 강남스타일이 40억을 돌파했다고 가정하겠습니다,
            근데 그걸 자료형을 다시 int로 롤백 시키게 되면 음수값으로 치환될 가능성이 있겠죠)
            용량 오버에 해당하는 현상을 미리 점검하기 위해 다운캐스팅 시에는
            명시적(explicit)으로만 변경이 가능합니다.

            -> 현재는 '기본 자료형'을 기준으로 예시를 들었지만 나중에는 '참조 자료형'
            캐스팅 개념과 연결됩니다. ch14-16 사이에 다루게 될 예정입니다.

            그래서 int가 21억 정도까지 표기되는데 long으로 바꾼 게 유튜브 사례입니다.
            그리고 이런 자료형에 관현 표기 역시 언어마다 다른데,
            SQL문에서는 long이 아니고 bigint로 쓰이는 등 여러분들이 적응해야 할 부분들이
            있습니다

            ch05_condition -> Condition01
         */
    }
}
