package practices.practice8.library.services;

import practices.practice8.library.model.Book;
import practices.practice8.library.model.Patron;
import practices.practice8.library.model.Library;
import java.util.List;


/**
 *
 * @author Ali Jamali
 *
 */

public class LibServices extends Library {
    private int day = 1;
    private int month = 1;


    public LibServices(List<Book> books, List<Patron> patrons, String currentDate) {
        super(books, patrons, currentDate);
    }

    //********************
    //Your Needs Methods *
    //********************
    String checkOutBook(Patron patron,Book  book) {
        if (isAvailable(book, patron) && patronValidate(patron)) {
            patron.getBooksCheckedOut().add(book);
            book.setCheckedOut(false);
            book.setDueDate(incrementCurrentDate());
            return patron.getName() + " added '" + patronDetails(patron, book);
        }  return book.getTitle()+" Is Not Available or " + patron.getName() + " Is not already checked out"+" \"Checked Out Failed\"";
    }

    String returnBook(Patron patron, Book book) {
        if (checkBooksInListOfPatron(patron, book)) {
            if (compare(book) < 0) {
                double extraCharged = Math.abs(compare(book)) * (0.5);
                updateFine(patron, extraCharged);
            }
            patron.getBooksCheckedOut().remove(book);
            book.setCheckedOut(true);
            return patron.getName() + " Returned '" + patronDetails(patron, book);
        }

      return book.getTitle()+" Is Not In "+patron.getName()+"'s Book List"+" \"Returned Failed\"";
    }

    //**********************************
    //Validators For Project's Demands *
    //**********************************
    public boolean isAvailable(Book book, Patron patron) {

        return book != null && !(patron.getBooksCheckedOut().contains(book)) && book.isCheckedOut() && getBooks().contains(book);

    }

    public boolean patronValidate(Patron patron) {
        return patron != null && patron.getBooksCheckedOut().size() < 2;
    }


    public boolean checkBooksInListOfPatron(Patron patron, Book book) {
        return (patron != null && book != null && patron.getBooksCheckedOut().contains(book));
    }

    void updateFine(Patron patron, double extraCharge) {
        patron.setFinesOwed(patron.getFinesOwed() + extraCharge);
    }

    //***************************************
    //Convertor Utils for Lists and Strings *
    //***************************************
    int[] dateConvertor(String date) {
        int[] ints = new int[3];
        String[] dateArray = date.split("/");
        for (int i = 0; i < dateArray.length; i++) {
            ints[i] = Integer.parseInt(dateArray[i]);
        }
        return ints;
    }

    int sumOfDays(String date) {
        return (dateConvertor(date)[0]) + (dateConvertor(date)[1] * 30) + (dateConvertor(date)[2] * 365);
    }


    int compare(Book book) {
        return sumOfDays(getCurrentDate()) - sumOfDays(book.getDueDate());
    }


    String patronDetails(Patron patron, Book book) {
        return book.getTitle() + "' Author: '" + book.getAuthor() + "' Book Publication Year: '" + book.getPublicationYear() + "' Due Date : '" + book.getDueDate() + " From Own Books List" + " And Update Fine Is: '" + patron.getFinesOwed() + "$'" + "\n Book List is: " + list(patron.getBooksCheckedOut());
    }

    String list(List<?> list) {
        StringBuilder s = new StringBuilder();
        for (Object o : list) {
            s.append("\n").append(o).append("\n ");

        }
        return s.toString();
    }


    //**************
    //Dates Utils
    //**************
    String incrementCurrentDate() {
        String date;

        if (day() > 30) {
            date = (day % 30) + "/" + ++month + "/1402";
            day = day() % 30;
        } else date = day() + "/" + month + "/1402";
        return date;
    }

    public int day() {
        day = day + 7;
        return day;
    }

}
