package ch19_collections;
/*
    Map은 key - value pair / 쌍 / entry
 */

import java.util.*;

public class StrMap {
    public static void main(String[] args) {
        // Map의 선언 및 초기화
        Map<String, String> strMap1 = new HashMap<>();

        // key - value 삽입 메서드 -> .put(키, 값);
        strMap1.put("KOR2026001", "김일");
        strMap1.put("KOR2026002", "김이");
        strMap1.put("KOR2026003", "김삼");
        strMap1.put("KOR2026004", "김사");
        strMap1.put("KOR2026005", "김오");
        System.out.println(strMap1);
        // 같은 key에 value를 입력하게 될 경우

        strMap1.put("KOR2026005", "KimFive");
        System.out.println(strMap1);
        // key 하나 당 value는 하나이기 때문에 같은 key를 지정하고 value를 입력한다면
        // 가장 최근 걸로 덮어쓰게 됩니다. -> 변수와 비슷하죠.

        Map<String, Double[]> koreanScores = new HashMap<>();
        koreanScores.put("김일", new Double[4]);

        Map<String, Double> koreanScores2= new HashMap<>();
        koreanScores2.put("김일", 98.2);
        koreanScores2.put("김이", 100.0);
        koreanScores2.put("김삼", 22.2);
        koreanScores2.put("김사", 67.45);
        koreanScores2.put("김오", 70.1);
        // 특정 key의 value 수정
        // # 1 아까 한 것처럼 key를 정확하게 쓴 다음에 value를 수정하는 겁니다.
        koreanScores2.put("김오",4.5);

        // # 2 .replace()
        koreanScores2.replace("김육" , 789.2);
        /*
            두 가지 방법이 준재하는 이유는 .put()의 경우에는
            기존에 key가 존재한다면 value에 재대입하게 되겠지만
            없는 key라면 아예 key를 새로 생성한다는 점입니다.

            반면에 .replace()의 경우에는 존재하지 않는 key라면 value의 갱신이 일어나지 않습니다.
            key가 존재할 때만 value의 값이 변경됩니다.
         */

        // .containskey() -> boolean
        boolean searchKeyFlag1 = strMap1.containsKey("KOR2026001");
        System.out.println("KOR2026001 존재 여부 : " + searchKeyFlag1);

        // .containsValue() -> boolean : 특정 value 존재 여부
        boolean searchValueFlag1 = strMap1.containsValue("김삼");
        System.out.println(strMap1.get("KOR2026003")+ " 존재 여부 : " + searchValueFlag1);

        // Map의 entry로부터 Set을 생성
        Set<Map.Entry<String, String>> entrySet1 = new HashSet<>();
        // 이상의 코드는 set 하나 생성하는데, 내부의 key가 String, Value가 String인 Map이
        // Set의 각각의 element에 해당한다는 것을 의미합니다.

        Set<Map.Entry<String, String>> entrySet2 = strMap1.entrySet();
        // strMap1의 자료형은 당연히 Map일텐데 .entrySet()의 호출 결과가 Set<Map.Entry<String,String>>
        // 으로 자동완성 된 이유는 저희가 그렇게 선언했기 때문입니다. - >  intellij support에 해당함
        // 그럼 이제 우리 수준에서는 strMap1.entrySet()의 호출 결과가 일종의 형변환이 이루어진 로직이 있고
        // 해당 자료형으로 return해서 entrySet2라는 객체에 데이터를 담았다고 해석할 수 있겠습니다.
        System.out.println(entrySet2);

        // 근데 Map을 Set으로 바꿨다면 아까 학습한 내용을 토대로 봤을 때 Set -> List로 형변환할 수 있네요.
//        List<Map.Entry<String, String>> entryList = strMap1.?
        // 근데 위에거는 보니까 안되네요 Map을 List로 바꾸고 싶다면 Set을 경유하도록 하겠습니다.

        // 그리고 일단 경유해서 Map -> Set -> List가 됐다면 List에 있는 method도 쓸 수 있으니까
        // .sort() 등을 이용할 수 있겠습니다.

        // Key Set 출력
        Set<String> keySet = strMap1.keySet();
        System.out.println(keySet);

        // Value set은?
//        Set<String> valueSet = strMap1.values(); // .values()가 있는거 보니까
        /*
            Key는 당연히 중복이 안되기 때문에 Set으로 변환하더라도 데이터의 손실이 없지만
            각 Key의 value들은 중복 값이 있을 수도 있기 때문에 그것을 Set 자료형으로 변경할 경우
            데이터 누락이 생길 수 있으므로 불가능합니다.

            그리고 제가 여러분에게 요구하는 수준은 .values() 를 봤을 때 Collection이라는 자료형이
            return 된다는 것을 확인했기 때문에
         */
        Collection<String> values = strMap1.values();
        // 로 써보면 되지 않을까 라고 스스로 추측할 수 있으면 됩니다.
        /*
            Collections는 .sort()할때 써봤지만 Collection은 처음 써봤습니다.
            근데 return 형 본 다음에 직접 쓰신다면 너무 좋겠네요
         */
    }

}

