package ch20_json;

//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//import java.util.*;
//
//@AllArgsConstructor
//@Data
//class Book1{
//    private Long bookId;
//    private String title;
//    private String author;
//    private List<String> categories;
//}
//
//public class JSON4Task {
//    public static void main(String[] args) {
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        List<String> categories1 = new ArrayList<>();
//        categories1.add("프로그래밍");
//        categories1.add("컴퓨터공학");
//        Book1 book0 = new Book1(101L,"자바마스터","안선생",categories1 );
//        Book1 book1 = new Book1(101L,"자바 마스터","안선생",List.of("프로그래밍","컴퓨터공학"));
//
//        String jsonData1 = gson.toJson(book1);
//        System.out.println(jsonData1);
//
//        // Map으로 변환
//        Map<String,Object> bookmap1 = gson.fromJson(jsonData1,Map.class);
//        System.out.println("도서 제목 : " + bookmap1.get("title") );
//
//        // List -> JSON 배열 변환
//        List<Book> books = new ArrayList<>();
//        books.add(book1);
//        books.add(new Book(102L,"파이썬 입문","김철수",List.of("데이터분석")));
//
//        String booksString = gson.toJson(books);
//        System.out.println(booksString);
//    }
//}
