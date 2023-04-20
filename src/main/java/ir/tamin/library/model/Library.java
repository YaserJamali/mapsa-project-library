package ir.tamin.library.model;

import com.google.gson.Gson;

import java.util.List;

public class Library {

//    books (an array of Book objects), patrons (an array of Patron objects), and currentDate (a String).

    private List<Book> books;
    private List<Patron> patrons;
    private String currentDate;



    public Library(List<Book> books, List<Patron> patrons, String currentDate) {
        this.books = books;
        this.patrons = patrons;
        this.currentDate = currentDate;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Library setBooks(List<Book> books) {
        this.books = books;
        return this;
    }

    public List<Patron> getPatrons() {
        return patrons;
    }

    public Library setPatrons(List<Patron> patrons) {
        this.patrons = patrons;
        return this;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public Library setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
        return this;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
