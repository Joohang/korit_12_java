package bh00_realestate;

import java.util.ArrayList;
import java.util.List;

public class ApartmentDataManager {
    private List<ApartmentData> allData;

    public ApartmentDataManager() {
        this.allData = new ArrayList<>();
        allData.add(new ApartmentData("부산광역시 사하구 하단동", "하단 SK뷰", "84A", 45000, 15, 2018));
        allData.add(new ApartmentData("부산광역시 강서구 명지동", "명지 더샵", "84A", 65000, 25, 2022));
        allData.add(new ApartmentData("경상남도 창원시 성산구", "창원 센트럴", "59B", 38000, 10, 2020));
    }

    public void addApartmentData(ApartmentData data){
        this.allData.add(data);
    }

    public List<ApartmentData> getFilterdData(String region, String type, int minBuildYear) {
        List<ApartmentData> result = new ArrayList<>();
        for (ApartmentData data : allData ) {
            boolean regionMatch = data.getArea().contains(region);
            boolean typeMatch = data.getType().contains(type);
            boolean yearMatch = data.getBuildYear() >= minBuildYear;

            if (regionMatch && typeMatch && yearMatch) {
                result.add(data);
            }
        }
        return result;
    }
}
