package ch17_static.Practice;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = Book.builder().title("자바의 정석").price(7500).isbn("3").build();
        Book book2 = Book.builder().title("클린 코드").price(12000).isbn("4f").build();
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(Book.totalBooks);
    }
}
