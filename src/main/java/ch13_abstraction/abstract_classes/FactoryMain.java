package ch13_abstraction.abstract_classes;

public class FactoryMain {
    public static void main(String[] args) {
        // 추상 클래스는 객체 생성을 '원래는' 못한다.
        Factory factory1 = new Factory() {
            @Override
            public void produce(String model) {
                System.out.println(this.getName() + "에서 [ " + model + " ]을(를) 생산합니다.");
            }

            @Override
            public void manage() {
                System.out.println("가전 제품 공장을 관리합니다.");
            }
        };
        factory1.setName("임시 공장");          // 원래 객체 생성을 못하는데 Factory 객체가
        factory1.produce("모니터");      // 생성되었고, method 호출도 된다는 점이 문제입니다.
        /*
            이상의 개념은 익명 클래스로 java1.1 -> 근데 이 형식은 자주 쓰인다기 보다 추후 학습할 람다식
            (Lambda Expression)으로 대체되는 경우가 많습니다. (그리고 JavaScript에서도 동일한 방식을
            사용합니다.)

            재사용하지 않고 한 번만, 즉 이 경우에는 FactoryMain에서만 한번 쓰고 치운다면 사용하기 좋습니다.

            저희는 교육 상황이기 때문에 모든 클래스를 한 번 정의하고 그걸로 객체 한 두개 만들고 치우는
            경우가 많아서 모든 수업을 위처럼 익명 클래스로 정의할 수도 있지만
            기본적으로 여러 프로그램에서 동시에 쓸 객체가 아닌 경우에 익명 클래스를 통해 임시 객체 생성이
            가능하도록 지원한다고 보시면 됩니다.
         */
        // PhoneFactory 객체 생성
        PhoneFactory phoneFactory1 = new PhoneFactory();
        phoneFactory1.setName("애플 스마트폰 공장");
        // 그리고 추상 클래스가 자식 클래스에서 구현부를 작성했으므로
        // 재정의된 대로 출력되는지 확인
        phoneFactory1.produce("아이폰 에어2");
        phoneFactory1.manage();
        // 추상 클래스의 일반 메서드를 호출할 수 있는지 확인
        phoneFactory1.showInfo();
        /*
            어제 상속 배운 부분과 합쳐서 생각을 해볼 때, 추상 클래스는
            상속을 전제로 한다는 것을 알 수 있습니다. 하지만 Java 버전 업에
            따라 익명 클래스를 통해 FactoryMain에서만 임시적으로 쓸 수 있는
            객체를 생성하는 것도 가능합니다.

            그리고 메서드 오버라이딩의 경우 '재정의'를 전제로 하고 있기 때문에
            부모 클래스와 자식 클래스의 메서드 호출 결과가 '다르게' 굴러 갈 경우에만
            @Override가 요구되고, 동일한 경우에는 그냥 부모 클래스의 메서드를
            호출하면 되죠.

            그러면 개발자인 우리는 부모 클래스에만 적힌 메서드의 호출 방식(Call1()~4())
            과 return에 대해서 명확하게 알고 있어야지만 자식 클래스에서
            직접적으로 정의되지 않은 메서드를 호출하고 원하는 결과값을 얻을 수 있겠네요.

            만약 부모 클래스에 showInfo() 메서드가 있는 걸 몰랐다면
            PhoneFactory 클래스에 별개의 showInfo() 메서드를 따로 정의했을테니까요.
         */
        System.out.println("------------------------------------------");

        TableFactory tableFactory1 = new TableFactory();
        tableFactory1.upgrade("아이패드 프로 13인치 8세대");
        tableFactory1.setName("애플 태블릿 공장");
        tableFactory1.getName();
        tableFactory1.setName("구글 태블릿 공장");


        tableFactory1.produce("구글 테블릿");
        tableFactory1.manage();
        tableFactory1.upgrade("구글 테블릿 10인치 2세대");

//        9. Factory 클래스의 인스턴스인 factory2 객체를 생성할 것
//                - produce() 메서드는 model + 컴퓨터를 생산합니다. 라고 출력될 수 있도록 재정의
//                - manage() 메서드는 컴퓨터 공장을 관리합니다. 라고 출력될 수 있도록 재정의
//        factory2 메서드의 name은 삼성 컴퓨터 공장으로 set하시오.
//                factory2.showInfo()를 호출할 것

        TableFactory tableFactory2 = new TableFactory();
        System.out.println("==================");
        tableFactory2.setName("삼성 컴퓨터 공장");
        tableFactory2.produce("갤럭시북");
        System.out.println("==================");
        tableFactory2.showInfo();
    }
}
