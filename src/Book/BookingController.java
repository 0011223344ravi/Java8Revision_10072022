package Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookingController {



    public List<Book> getListOfBooksInSortedOrder(){

        List<Book>  books = new BookDTO().getAllData() ;
        Collections.sort(books, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        return books;
    }

    public List<Book> getListOfBooksInSortedOrder2ndApproach(){

        //2nd approach
        List<Book>  books = new BookDTO().getAllData() ;
        Collections.sort(books , new Comparator<Book>() {

            @Override public int compare(Book o1, Book o2) { return
                    o1.getName().compareTo(o2.getName()); } });
                 return books;
    }
  public static void main (String args []){

      BookingController bookingController = new BookingController();
      List<Book> list = new ArrayList<Book>();
      List<Book> list1 = new ArrayList<Book>();
      list = bookingController.getListOfBooksInSortedOrder();
      list1 = bookingController.getListOfBooksInSortedOrder2ndApproach();
      System.out.println(list);
      System.out.println(list1);


  }




}
