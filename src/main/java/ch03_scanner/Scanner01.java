package ch03_scanner;
import java.util.Scanner;
public class Scanner01 {
    public static void main(String[] args) {
        //        // 변수 선언
//        String name;
//        // 초기화
//        name = "안근수";
//        System.out.println(name);
        Scanner scanner = new Scanner(System.in);
//        // 변수에 재대입
//        System.out.print("이름을 입력하세요 >>> ");
//        name = scanner.next();
//        System.out.println(name);
        /*
            1. println vs. print
                ln : line의 의미로 실행하면 출력문이 다 나오고 나서 개행
                print로 작성하면 동일 라인에 그대로 연결됨.
            2. nextLine vs. next 등 다른 차이도 있습니다. -> 내일 수업

            현재까지의 상황에서
            Scanner scanner = new Scanner(System.in);
            이란 것을 쓰니까 콘솔에 데이터를 입력해서 변수에 저장할 수 있고
            그 변수(name)을 println하는 것이 가능하다 정도로 아는 것으로
            충분합니다.

            하지만 혹시 예습을 하고 싶으신 분들은
            Scanner scanner = new Scanner(System.in);이 '객체 생성'을 했고
            scanner.nextLine();은 '메서드 호출'과 관련있는 개념이기 때문에 관련
            부분을 학습하시면 됩니다.

            git add .
            git commit -m "feat: 20251222 Java Lesson 시작"
            git push

            2. next (Int / Double / Boolean, ... etc) vs. nextLine
                - nextLine()은 띄어쓰기를 허용합니다. enter키를 기준으로 데이터가 변수에 저장됩니다.
                -> 그래서 scanner.nextLine() 으로 사용했을 때 어제 kim il로 띄어쓰기 했을 때 저장이
                    가능했습니다.
                - 나머지는 허용이 안됩니다. 그래서 kim 2로 하니까 kim만 저장됐었습니다. 그리고 kim2로
                    바꿔 저장했을 때만 가능했습니다.
                - nextLine()이 엔터 키를 기준으로 데이터가 들어간다는 점은 어떤 부분에서 사람을
                    귀찮게 하는 부분이 있습니다.
         */
//        // scanner에 사용할 안내문(프롬프트) 출력문
//        System.out.print("올해는 몇 년도 인가요? >>> ");
//        // 변수를 선언하고 초기화
//        int year = scanner.nextInt();
//        System.out.println("당신의 이름은 무엇인가요? >>> ");
//        String name2 = scanner.nextLine();
//        System.out.println("연도 : " + year);
//        System.out.println("이름 : " + name2);

        /*
            이상의 코드에서의 문제점은 52 번 라인이 실행됐을 때 데이터를 입력 받지 않고
            그대로 넘어가서 53 번 라인과 54 번 라인이 실행된다는 점입니다.
            이상의 문제는 nextInt()에서 값을 입력하고 enter를 치게 되는데,
            그 경우 다음 nextLine()에서 enter키를 받아들여서 빈 값인 상태로 enter를
            쳤다고 알아듣기 때문에 곧장 53 번 라인이 실행됐습니다.

            해결 방법 : enter키를 받아주는 nextLine()을 하나 더 적어줍니다.
         */
        // scanner에 사용할 안내문(프롬프트) 출력문
        System.out.print("올해는 몇 년도 인가요? >>> ");
        // 변수를 선언하고 초기화
        int year = scanner.nextInt();
        // enter키를 받아주는 nextLine()을 추가
        scanner.nextLine();     // 얘는 enter만 받아주는거지 그 데이터를 어디다 쓸게 아니니까
        // 변수에 저장할 필요가 없겠죠. 변수에 저장한다는 건 메모리를 할당한다는 의미니까요.
        System.out.print("당신의 이름은 무엇인가요? >>> ");
        String name2 = scanner.nextLine();
        System.out.println("연도 : " + year);
        System.out.println("이름 : " + name2);






        scanner.close();
    }
}
