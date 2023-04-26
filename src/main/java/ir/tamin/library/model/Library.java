package practices.practice8.library.src.main.java.ir.tamin.library.model;

import com.google.gson.Gson;

import java.util.List;

public class Library {

    //**************************
    // *       Properties      *
    //**************************
    private List<Book> books;
    private List<Patron> patrons;
    private String currentDate;



    //**************************
    // *     Constructors      *
    //**************************
    public Library(List<Book> books, List<Patron> patrons, String currentDate) {
        this.books = books;
        this.patrons = patrons;
        this.currentDate = currentDate;
    }

    //***********************************
    // *       Getters and Setters      *
    //***********************************
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

    //***********************************
    // *       toString Method          *
    //***********************************
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
