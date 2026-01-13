package ch19_collections;

import java.util.*;

public class FieldTrip {
    public static void main(String[] args) {
        int numOfStudent;

        List<String> fieldTrips = new ArrayList<>();
        Set<String> fieldTripSet = new HashSet<>();
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("몇 명의 학생이 수학 여행지를 입력하시겠습니까??");
        numOfStudent = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        for (int i = 0; i <= numOfStudent - 1; i++) {
            System.out.println((i + 1) + "번 학생의 수학 여행지를 입력하세요");
            String fieldTrip = scanner2.nextLine();
            fieldTrips.add(fieldTrip);
        }
        System.out.println(fieldTrips);
        for (int i = 0 ; i < fieldTrips.size() ; i ++) {
            System.out.println((i+1) + "번 학생의 후보지 : " + fieldTrips.get(i));
        }
        fieldTripSet.addAll(fieldTrips);
        for (String locates : fieldTripSet) {
            System.out.println("수학여행 후보지는 \n"  );
            System.out.println(locates + "\n입니다.");

        }

    }
}




