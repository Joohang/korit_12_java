package ch19_collections;

import java.util.*;

public class StrList {
    public static void main(String[] args) {
        // 1. Array와의 차이점 # 1
        // 선언 방식
        String[] strArray = new String[5];          //배열 선언및 초기화
        List<String> strList = new ArrayList<>();   // List 선언 방식 및 초기화

        // Array와의 차이점 # 2 - 값을 대입하는 방법
        // 배열
        strArray[0] = "김영";
        strArray[4] = "김사";

        // List -> method를 경유해야 합니다.
        strList.add("Java");
        strList.add("python");
        strList.add("JavaScript");
        strList.add("C#");
        strList.add("C++");
        // 순서가 보장되어 있기 때문에 집어놓은 순서대로 값이 들어갑니다.
        // 그리고 최초에  List 의 방의 개수를 정하지 않았죠. 알아서 방이 늘어납니다.

        // Array와의 차이점 # 3 - 출력 방식
        // strArray를 출력만 하시오.
        System.out.println(Arrays.toString(strArray));
        // List의 출력
        System.out.println(strList);

        // Array 와의 차이점 # 4 - 삭제 방식
        strArray[0] = null;
        // 그런데  list는 생각해보면 인덱스 넘버가 딱 고정이지도 않습니다.
        String removeElem1 = " JavaScript";
        boolean isRemoved = strList.remove("JavaScript");
        System.out.println(removeElem1 + " 삭제 여부 : " + isRemoved);
        System.out.println(strList);
        // 이상의 경우 차이점이 뭐냐면 Array의 경우 null갑 대입이기 때문에
        // 0 번지가 null이고 여전히 5개짜리 방을 가지고 있을겁니다.
        // 근데 list의 경우 삭제하니까 아예 방이 4개짜리로 줄어들었음을 확인할 수 있습니다.

        // 정렬 방법
        // 배열은 Arrays.sort였습니다.
        //오름차순
        Collections.sort((strList));
        System.out.println(strList);
        //내림차순
        Collections.sort(strList, Comparator.reverseOrder());
        System.out.println(strList);

        /*
            특정  element의 검색 (list내의) -> .contains() 메서드 사용.
            리스트명.contails(목적어)
         */
        String searchElem1 = "python";
        boolean contains1= strList.contains(searchElem1);
        System.out.println(searchElem1 + " 포함 여부 : " + contains1);

        String searchElem2 = "py";
        boolean contains2 = strList.contains(searchElem2);
        System.out.println(searchElem2 + " 포함 여부 : " + contains2);

        /*
            이상의 이유는 list는 element가 명확하게 일치하는 지를 확인합니다.
            그래소 py는 python이라는 String 데이터의 일부이기는 하지만 element 전체를
            의미하는 것은 아니기 때문에 false결과값이 나오게 됩니다

            strArray에 김0 김1 김2 김3 김4 로 집어넣으시오.
            strArray를 일반 for 문으로 출력하고 그 결과가 김0 님 / 김1 님 ... 김4 님/
            으로 결과값이 나오도록 작성하시오
            strArray를 향샹된 for문으로 작성하고 김0 학생 - 김1 학생 .... 김4 학생 -
            으로 결과값이 나오도록 작성하시오
         */

        int[] strArray1 = new int[5];
        for (int i = 0 ; i < strArray1.length ; i++ ) {
            System.out.print("김"+i + " 님 / ");
        }
        System.out.println();

        for (int strArrays : strArray1) {
            System.out.print("김"+strArrays + " 학생 - ");
        }
        System.out.println();

        // list는 index 추출할 때 리스트명.size()를 씁니다. .length 아니가, method인 점 주의

        // 그러면 일반 for문으로 strList를 Java 언어 / python 언어 ... 등으로 출력하시오
        // 향상된 for문으로 Java 공부 / ...... /등으로 출력하시오

        for ( int i = 0 ; i < strList.size() ; i ++) {
            System.out.print(strList.get(i) + " 언어 / ");
        }
        System.out.println();
        for (String lists : strList ) {
            System.out.print(lists + " 공부 / ");
        }
        /*
            이상의 경우에서 배열일 때는 구경도 못하는 향상된  for문의 장점이 있는데,
            내부의  index 지정을 .length를 쓰는지 .size()를 쓴튼지 등을 고려하지 않아도
            된다는 점과, 출력할 때 [] 인덱스 넘버를 사용해야하는지 .get()을 사용해야하는지
            여부 등을 따지지 않아도 된다는 점입니다.
         */
    }
}
