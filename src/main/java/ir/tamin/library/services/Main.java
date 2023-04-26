package practices.practice8.library.src.main.java.ir.tamin.library.services;

import practices.practice8.library.src.main.java.ir.tamin.library.model.Book;
import practices.practice8.library.src.main.java.ir.tamin.library.model.Patron;
import practices.practice8.library.src.main.java.ir.tamin.library.services.LibServices;
import java.util.ArrayList;
import java.util.List;

/*
* */
public class Main {
    public static void main(String[] args) {


        //********************
        //*Create Some Books
        //********************

        Book book1=new Book("The Old Man And Sea","Hemingway",1960,true,"20/05/1402");
        Book book2=new Book("The Bright Nights","Dastayoski",1890,false,"15/07/1400");
        Book book3=new Book("Two Cities Tale","Dickens",1859,true,"13/01/1403");
        Book book4=new Book("Oliver Twist","Dickens",1838,true,"18/08/1402");
        Book book5=new Book("Fool","Dastayoski",1893,true,"18/08/1402");
        Book book6=new Book("War and Peace","Tolstoy",1869,true,"18/08/1402");
        Book book7=new Book("Shahanmeh","Ferdosi",1010,true,"18/08/1402");

        //********************
        //*Create Some Patrons
        //********************

        List<Book> yaserBooks=new ArrayList<>();
        List<Book> aliBooks=new ArrayList<>();
        List<Book> rezaBooks=new ArrayList<>();


        yaserBooks.add(book1);
        aliBooks.add(book4);
        rezaBooks.add(book5);
        rezaBooks.add(book7);

        Patron yaser=new Patron(1,"Yaser",yaserBooks,2.75);
        Patron ali=new Patron(2,"Ali",aliBooks,4.1);
        Patron reza=new Patron(3,"Reza",rezaBooks,120);

        //********************
        //*Create Library
        //********************

        List<Patron> patronList=new ArrayList<>();
        patronList.add(yaser);
        patronList.add(ali);
        patronList.add(reza);

        List<Book> libraryBooks=new ArrayList<>();
        libraryBooks.add(book1);
        libraryBooks.add(book2);
        libraryBooks.add(book3);
        libraryBooks.add(book4);
        libraryBooks.add(book5);
        libraryBooks.add(book7);


        LibServices lib=new LibServices(libraryBooks,patronList,"01/1/1402");

        //*************************************
        //********   Library Actions     ******
        //*************************************


        System.out.println("these are Books Of Library");
        System.out.println(lib.list(lib.getBooks()));
        System.out.println("*********************************************************************************");
        System.out.println("these are Patrons Of Library");
        System.out.println(lib.list(lib.getPatrons()));
        System.out.println("*********************************************************************************");
        System.out.println(lib.checkOutBook(yaser,book3));
        System.out.println("*********************************************************************************");
        System.out.println(lib.checkOutBook(ali,book1));
        System.out.println("*********************************************************************************");
        System.out.println(lib.returnBook(yaser,book3));
        System.out.println("*********************************************************************************");
        System.out.println(lib.returnBook(reza,book3));
        System.out.println("*********************************************************************************");
        System.out.println(lib.returnBook(reza,book4));
        System.out.println("*********************************************************************************");
        System.out.println(lib.checkOutBook(reza,book6));
        System.out.println("*********************************************************************************");
        System.out.println("these are Books Of Library After Everything");
        System.out.println(lib.list(lib.getBooks()));
        System.out.println("*********************************************************************************");
        System.out.println("these are Patrons Of Library After Everything"  );
        System.out.println(lib.list(lib.getPatrons()));




    }
}