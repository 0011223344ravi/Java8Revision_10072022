package Book;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookDTO {

    public List<Book> getAllData(){

       return  Stream.of(new Book(1,"Spring",500),
               new Book(2,"Java",500),
               new Book(1,"Java Script",500)
                ).collect(Collectors.toList());
    }
}
