package ch11_arrays;

public class Array09EnhancedFor {
    public static void main(String[] args) {
        String [] persons = {"김일", "김이", "김삼", "김사", "김오"};
        /*
            실행 예
            1 번 : 김일
            2 번 : 김이
            3 번 : 김삼
            4 번 : 김일
            5 번 : 김일

         */
            for (int i = 0 ; i < persons.length ; i ++) {
            System.out.println((i+1) + " 번 : " + persons[i]);
        }

        //향상된 for
        int i = 0 ;
        for (String person : persons) {
            System.out.println( ++ i + " 번 : " + person);
        }

    }
}
