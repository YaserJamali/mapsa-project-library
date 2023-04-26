package practices.practice8.library.src.main.java.ir.tamin.library.model;

import com.google.gson.Gson;

import java.util.List;

public class Patron {
    //**************************
    // *       Properties      *
    //**************************
    private int libraryId;
    private String name;
    private List<Book> booksCheckedOut;
    private double finesOwed;

    //**************************
    // *     Constructors      *
    //**************************

    public Patron(int libraryId, String name, List<Book> booksCheckedOut, double finesOwed) {
        this.libraryId = libraryId;
        this.name = name;
        this.booksCheckedOut = booksCheckedOut;
        this.finesOwed = finesOwed;
    }

    //***********************************
    // *       Getters and Setters      *
    //***********************************
    public int getLibraryId() {
        return libraryId;
    }

    public Patron setLibraryId(int libraryId) {
        this.libraryId = libraryId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Patron setName(String name) {
        this.name = name;
        return this;
    }

    public List<Book> getBooksCheckedOut() {
        return booksCheckedOut;
    }

    public Patron setBooksCheckedOut(List<Book> booksCheckedOut) {
        this.booksCheckedOut = booksCheckedOut;
        return this;
    }

    public double getFinesOwed() {
        return finesOwed;
    }

    public Patron setFinesOwed(double finesOwed) {
        this.finesOwed = finesOwed;
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
