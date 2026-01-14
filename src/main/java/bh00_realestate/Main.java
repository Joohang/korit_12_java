package bh00_realestate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApartmentDataManager manager = new ApartmentDataManager();

        manager.addApartmentData(new ApartmentData("사하구 하단동","SK view","84타입",30000,30,2021));
        manager.addApartmentData(new ApartmentData("부산광역시 사하구 하단동", "가락타운", "84타입", 30000, 10, 1992));
        List<ApartmentData> result = manager.getFilterdData("사하구","84",2015);
        System.out.println("=== 마케팅 분석 결과 (신축 위주) ===");

        if (result.isEmpty()) {
            System.out.println("조건에 맞는 아파트 데이터가 없습니다.");
        } else {
            // 향상된 for문 사용 (배운 내용 4번 & 9번 활용!)
            for (ApartmentData data : result) {
                System.out.print("단지명: " + data.getAptName());
                System.out.print(" | 금액: " + data.getTransactionPrice() + "만원");
                System.out.print(" | 타입: " + data.getType());
                System.out.println(" | 준공연도: " + data.getBuildYear() + "년");
            }
        }
    }
}
