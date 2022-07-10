package Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookingController {



    public List<Book> getListOfBooksInSortedOrder(){

        List<Book>  books = new BookDTO().getAllData() ;
        Collections.sort(books, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        //1 approach 	//Collections.sort(books,new MyComparator());

        //2nd approach
        /*
         * Collections.sort(books , new Comparator<Book>() {
         *
         * @Override public int compare(Book o1, Book o2) { return
         * o1.getBookName().compareTo(o2.getBookName()); } });
         */


        return books;
    }
  public static void main (String args []){

      BookingController bookingController = new BookingController();
      List<Book> list = new ArrayList<Book>();
      list = bookingController.getListOfBooksInSortedOrder();
      System.out.println(list);


  }

}
