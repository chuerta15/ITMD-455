package com.example.joanc.hw7and8;

/**
 * Created by joanc on 4/07/2018.
 */

public class Book {

    private int id;
    private String title;
    private String author;
    private String rating;

    public Book() {
    }

    public Book(String title, String author, String rating) {
        super();
        this.title = title;
        this.author = author;
        this.rating = rating;

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author="
                + author +  "]";
    }
}
