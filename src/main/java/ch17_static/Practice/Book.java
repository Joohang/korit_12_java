package ch17_static.Practice;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString

@Getter
public class Book {
    private String isbn;
    private String title;
    private String author;
    private int price;


    public static int totalBooks = 0;
    @Builder
    public Book(String isbn, String title, String author, int price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;

        ++totalBooks;
    }

    //    public Book () {
//        System.out.println("책이 생성되었습니다.");
//        totalBooks++;
//    }
}
