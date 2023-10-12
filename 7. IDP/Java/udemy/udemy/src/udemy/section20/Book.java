package udemy.section20;

import java.util.ArrayList;

public class Book {
    private int id;
    private String name;
    private String author;

    private ArrayList<Review> reviews = new ArrayList<>();

//    public Review rating;
//    public Review description;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }
    public String toString() {
        return String.format("BookID - %d, Book Name - %s, Author - %s reviews - %s",
                id, name, author, reviews);
    }
}
