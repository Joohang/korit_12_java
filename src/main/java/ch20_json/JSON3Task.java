package ch20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@AllArgsConstructor
@Data
class Book{
    private long bookId;
    private String title;
    private String author;
    private List<String> categories;
}

public class JSON3Task {
    public static void main(String[] args) {
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        Book book1 = new Book(101,"자바마스터","안선생", Arrays.asList("프로그래밍","컴퓨터공학"));
        System.out.println("[미션 2: 객체 -> JSON 변환 결과");
        System.out.println(gsonBuilder.toJson(book1));
        Map<String, Object> bookMap = gsonBuilder.fromJson(gsonBuilder.toJson(book1),Map.class);
        System.out.println("\n[미션 3: Map 변환 후 제목 추출]\n");
        System.out.println("도서 제목 : " + bookMap.get("title"));
        List<Book> bookList = new ArrayList<>();
        Book book2 = new Book(102,"파이썬 입문","김철수",Arrays.asList("데이터 분석"));
        bookList.add(book1);
        bookList.add(book2);
        String jsonBookList = gsonBuilder.toJson(bookList);
        System.out.println("\n[미션 4: 리스트 -> JSON 배열 변환]\n");
        System.out.println(jsonBookList);


    }


}
