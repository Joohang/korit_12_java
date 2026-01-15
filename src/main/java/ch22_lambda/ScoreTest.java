package ch22_lambda;

import java.util.List;

public class ScoreTest {
    public static void main(String[] args) {
        List<Integer> scores = List.of(23, 1657, 2654, 9403, 59, 68, 1, 5 ,67, 4, 3,56);
        scores.stream()                             // 1. StreamAPI 사용할 거다
                .filter(s->s>=60)           // 2. 60점 미만은 빼버릴거다
                .map(s->s+5)                // 3. 남아있는 거에 5점씩 더해줄거다
                .sorted()                           // 4. 오름 차순으로 정렬할거다
                .forEach(System.out::println);      // 5. 각각 출력할거다
    }
}
