package udemy.section20;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book(2,"Book Name","Sean");
        System.out.println(book);
        book.addReview(new Review(1,"Awesome",10));
        System.out.println(book);
    }
}
