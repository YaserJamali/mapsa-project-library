package ir.tamin.library.services;

import ir.tamin.library.model.Book;
import ir.tamin.library.model.Patron;

public class LibServices {
//    checkOutBook(Patron patron, Book book):
//    Allows a patron to check out a book.
//    This method should first check if the book is available (i.e., not already checked out)
//    and if the patron has not already checked out the maximum number of books.
//    If both of these conditions are true,
//    the book should be checked out and added to the patron's list of checked-out books.
//    The book's due date should be set to the current date plus two weeks.
void  checkOutBook(Patron patron, Book book){}






//    returnBook(Patron patron, Book book):
//    Allows a patron to return a book.
//    This method should first check if the book is checked out by the patron,
//    and if it is, should update the book's status to "not checked out" and
//    remove it from the patron's list of checked-out books.
//    If the book is returned after its due date,
//    the patron should be charged a fine of $0.50 per day overdue.
Book returnBook(Patron patron, Book book){
    return null;
}





//    incrementCurrentDate():
//    Advances the current date by one day.
//    This method should be called once per day to update the due dates of checked-out books
//    and calculate fines owed by patrons.
void incrementCurrentDate(){}



}
