package ch10_access_modifier.bank;
/*
    과제 가이드라인
    1. 필드
        accountNum(계좌번호, 정수)
        accountHolder(예금주이름, 문자열)
        balance(잔액, 정수)
        pinNumber(비밀번호, 4 자리 정수 0 ~ 9999)

    2. 생성자
        기본 생성자
        계좌번호만 있는 생성자
        계좌번호, 예금주를 받는 생성자
        계좌번호, 예금주, 초기 잔액을 받는 생성자
        계좌번호, 예금주, 초기 잔액, 비밀번호를 받는 생성자

    3. 메서드
        1) Setter / Getter
            특히 Setter의 경우에는 유효성 검증 로직을 삽입해야 함.
                -> 잔액은 음수일 수 없음
                -> 비밀번호는 0 이상 9999 이하까지만 가능. -> 실패하면 "불가능한 비밀번호입니다."
        2) deposit(int amount, int inputPin) -> 입금 관련 메서드 / call2() 유형으로 작성
            - 올바른 비밀번호인지 확인 -> 틀리면 "비밀번호가 틀렸습니다."하고 메서드 종료
            - 유효한 금액인지 검증(amount가 0초과인지) -> 실패하면 "불가능한 입력 금액입니다."
            - 콘솔창에
                0000원이 입금되었습니다. 현재 잔액 : 00000원

            withdraw(int amount, int inputPin) -> 출금 관련 메서드 / call2() 유형으로 작성
                - 올바른 비밀번호인지 확인 -> 틀리면 "비밀번호가 틀렸습니다."하고 메서드 종료
                - 유효한 금액인지 검증(amount 0초과) -> 실패하면 "불가능한 입력 금액입니다."
                - 출금 후 잔액이 0 이상인지 확인 -> 음수라면 "출금 불가입니다."
                - 콘솔창에
                    0000원이 출금되었습니다. 현재 잔액 : 0000원
        3) showAccountInfo() / call1() 유형으로 작성
            - 콘솔창에
                계좌 번호 : 123456
                계좌 소유자 : 홍길동
                현재 잔액 : 100000원
            라고 출력될 수 있도록 작성할 것.

        전체 실행 예

        계좌 번호 : 123456
        계좌 소유자 : 홍길동
        현재 잔액 : 100000원                     (십만원)

        계좌 번호 : 987654
        계좌 소유자 : 신사임당
        현재 잔액 : 500000원                     (오십만원)

        50000원이 입금되었습니다. 현재 잔액 : 150000원            # account1에 대한 입금(오만원)
        잔액이 부족하여 출금할 수 없습니다.                        # account1에서 200000원 출금 시도 실패 사례(이십만원)
        100000원이 출금되었습니다. 현재 잔액 : 50000원            # account1에 대한 출금(십만원 출금 성공)

        100000원이 출금되었습니다. 현재 잔액 : 400000원           # account2에 대한 출금(십만원 출금)
        200000원이 입금되었습니다. 현재 잔액 : 600000원           # account2에 대한 입금(이십만원 입금)

        최종 계좌 정보
        계좌 번호 : 123456
        계좌 소유자 : 홍길동
        현재 잔액 : 50000원                      (오만원)

        계좌 번호 : 987654
        계좌 소유자 : 신사임당
        현재 잔액 : 600000원                     (육십만원)
 */
class Bank {
    private int accountNum;
    private String accountHolder;
    private int balance;
    private int pinNumber;
    //기본 생성자

    public Bank() {
    }

    //계좌번호만 있는 생성자

    public Bank(int accountNum) {
        this.accountNum = accountNum;
    }

    //계좌번호, 예금주를 받는 생성자

    public Bank(int accountNum, String accountHolder) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    //계좌번호, 예금주, 초기 잔액을 받는 생성자

    public Bank(int accountNum, String accountHolder, int balance) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    //계좌번호, 예금주, 초기 잔액, 비밀번호를 받는 생성자

    public Bank(int accountNum, String accountHolder, int balance, int pinNumber) {
        if (pinNumber > 9999||pinNumber<0) {
            System.out.println("불가능한 입력입니다.");
            return;
        }
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
        if (balance<0) {
            System.out.println("불가능한 잔액입니다.");
            return;
        } this.balance = balance;
        this.pinNumber = pinNumber; // 이 부분에 로직이 필요하겠네요.

    }
    //setter

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(int balance) {
        if (balance<0) {
            System.out.println("불가능한 잔액입니다.");
            return;
        } this.balance = balance;



    }

    public void setPinNumber(int pinNumber) {
        if (pinNumber > 9999||pinNumber<0) {
            System.out.println("불가능한 입력입니다.");
            return;
        }
        this.pinNumber = pinNumber;
    }
    //getter

    public int getAccountNum() {
        return accountNum;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public int getPinNumber() {
        return pinNumber;
    }
    // method
//      입금 관련 메서드 / call2() 유형으로 작성
//            - 올바른 비밀번호인지 확인 -> 틀리면 "비밀번호가 틀렸습니다."하고 메서드 종료
//            - 유효한 금액인지 검증(amount가 0초과인지) -> 실패하면 "불가능한 입력 금액입니다."
//            - 콘솔창에
//                0000원이 입금되었습니다. 현재 잔액 : 00000원
    public void deposit(int amount, int inputPin) {
        if (inputPin < 0 || inputPin > 9999) {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }
        if (amount < 0) {
            System.out.println("불가능한 입력 금액입니다.");
            return;
        } this.balance += amount;

            System.out.println(amount + "원이 입금되었습니다. 현재 잔액 :" + this.balance  + "원" );

    }
//    출금 관련 메서드 / call2() 유형으로 작성
//                - 올바른 비밀번호인지 확인 -> 틀리면 "비밀번호가 틀렸습니다."하고 메서드 종료
//                - 유효한 금액인지 검증(amount 0초과) -> 실패하면 "불가능한 입력 금액입니다."
//            - 출금 후 잔액이 0 이상인지 확인 -> 음수라면 "출금 불가입니다."
//            - 콘솔창에
//                    0000원이 출금되었습니다. 현재 잔액 : 0000원
    public void withdraw(int amount, int inputPin) {


        if (!checkPassword(inputPin))

            return;

        if (! checkBalnce(amount)) return;


        System.out.println(amount + "원이 출금되었습니다. 현재 잔액 :" + balance + "원" );


    }


    public void showAccountInfo() {
        System.out.println("계좌 번호 :" + accountNum +"\n" + "계좌 소유자 :" + accountHolder +"\n"
        + "현재 잔액 :" + this.balance + "원\n" );

    }
    private boolean checkPassword(int inputPin) {
        boolean result = true;
        if (inputPin != pinNumber) {
            System.out.println("불가능한 입력입니다.");
            result = !result;
        } return result;
    }

    private boolean checkBalnce(int amount) {
        boolean result = true;
        if (amount <= 0) {
            System.out.println("작업에 실패했습니다.");
            result = !result;
        }
        return result;
    }
//    - 콘솔창에
//    계좌 번호 : 123456
//    계좌 소유자 : 홍길동
//    현재 잔액 : 100000원
}

public class BankMain {
    public static void main(String[] args) {
//        전체 실행 예
//
//        계좌 번호 : 123456
//        계좌 소유자 : 홍길동
//        현재 잔액 : 100000원                     (십만원)
//
        Bank bank1 = new Bank(987654,"신사임당",500000,1234);
        Bank bank2 = new Bank(123456,"홍길동",100000,1234);
        bank1.showAccountInfo();

        bank2.deposit(50000,1234);
        bank2.withdraw(2000000,1234);
        bank2.withdraw(100000,1234);

        bank1.withdraw(100000,1234);
        bank1.deposit(200000,1234);

        bank2.showAccountInfo();
        bank1.showAccountInfo();

//        계좌 번호 : 987654
//        계좌 소유자 : 신사임당
//        현재 잔액 : 500000원                     (오십만원)
//
//        50000원이 입금되었습니다. 현재 잔액 : 150000원            # account1에 대한 입금(오만원)
//        잔액이 부족하여 출금할 수 없습니다.                        # account1에서 200000원 출금 시도 실패 사례(이십만원)
//        100000원이 출금되었습니다. 현재 잔액 : 50000원            # account1에 대한 출금(십만원 출금 성공)
//
//        100000원이 출금되었습니다. 현재 잔액 : 400000원           # account2에 대한 출금(십만원 출금)
//        200000원이 입금되었습니다. 현재 잔액 : 600000원           # account2에 대한 입금(이십만원 입금)
//
//        최종 계좌 정보
//        계좌 번호 : 123456
//        계좌 소유자 : 홍길동
//        현재 잔액 : 50000원                      (오만원)
//
//        계좌 번호 : 987654
//        계좌 소유자 : 신사임당
//        현재 잔액 : 600000원                     (육십만원)


        // 즉 생성자가 호출은 되었으나 field에 값을 집어넣는 단계에서 메서드가 정지되었습니다.
        // 결과적으로 객체생성은 되었지만 필드에 값이 없는 상태이기때문에
        // 기본 생성자를 통해 객체를 생성한 것과 같은 결과값을 가진다.
    }
}
