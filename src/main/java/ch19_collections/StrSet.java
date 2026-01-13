package ch19_collections;

import java.util.*;

/*
    List는 순서가 있고 중복 허용
    Set은 순서는 없고 중복은 허용하지 않기 때문에
    List -> Set 혹은 Set -> List 로의 형변환이 중요합니다.
    예를 들어 List로 전체 설문을 받고, Set을 통해 중복을 제거하여
    후보군만 남기는 등의 형태로 사용할수 있습니다.
    또한 Set으로 중복을 제거한 후에 다시 List로 돌려서
    .get(인덱스 넘버) 로 조회도 할수 있습니다.
    Set은 순서가 없어서....

    그래서 Set은 저희가 중1때 학습하는 집합 개념과 유사합니다.
    다만 집합은 숫자로만 이루어졌던 반면에
    Set은 다양한 자료형을 기준으로 만들 수 있습니다.
 */
public class StrSet {
    public static void main(String[] args) {
        // Set 객체 생성
        Set<String> strSet = new HashSet<>();
        // List도 생성 ( 형변환 중요하다고 했으니까)
        List<String> strList = new ArrayList<>();

        // List의 element들을 전부 Set에 대입하겠습니다. : 세트명.addAll(리스트명);

        strList.add("java");
        strList.add("java");
        strList.add("java");
        strList.add("python");
        strList.add("python");
        strList.add("python");
        strList.add("SpringBoot");
        strList.add("SpringBoot");
        strList.add("SpringBoot");
        strList.add("SpringBoot");
        strList.add("SpringBoot");
        strList.add("SpringBoot");

        // Set의 출력
        System.out.println(strList);

        strSet.addAll(strList);
        System.out.println(strSet);

        for(String elem : strSet) {
            System.out.println(elem + " 언어 ");
        }
        // 향상된 for문으로는 출력이 가능합니다.
        // 일반 for문으로는 안됩니다.
//        for (int i = 0 ; i < strSet.size() ; i++ ) {
//            System.out.println(strSet.get);
//        }


        // 어쨌든 중복 제거를 strSet에서 했기 때문에 중복 제거 버전을 다시 List로 옯길 수 있을겁니다.
        List<String> modifiedList = new ArrayList<>();
        modifiedList.addAll(strSet);
        System.out.println(modifiedList);
        Collections.sort(modifiedList);
        System.out.println(modifiedList);
    }
}
