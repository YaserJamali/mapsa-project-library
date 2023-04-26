package ir.tamin.library.model;

import com.google.gson.Gson;
import ir.tamin.library.services.LibServices;

/**
 *
 * @author Ali Jamali
 *
 */
public class Book {

    //**************************
    // *       Properties      *
    //**************************

    private String title;
    private String author;
    private int publicationYear;

    private boolean isCheckedOut;
    private String dueDate;

    //**************************
    // *     Constructors      *
    //**************************

    public Book(String title, String author, int publicationYear, boolean isCheckedOut, String dueDate) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isCheckedOut = isCheckedOut;
        this.dueDate =dueDate;
    }

    //***********************************
    // *       Getters and Setters      *
    //***********************************
    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public Book setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
        return this;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public Book setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
        return this;
    }

    public String getDueDate() {
        return dueDate;
    }

    public Book setDueDate(String dueDate) {
        this.dueDate = dueDate;
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
