package bh00_realestate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ApartmentData {
    private String area;

    //피드백 반영 당장 구와 시는 복잡하니 나중에 생각하고 Dong을 우선적으로
    private String aptName;
    private String type;        // 피드백 적용
    private long transactionPrice;
    private int volume;
    private int buildYear;
}
