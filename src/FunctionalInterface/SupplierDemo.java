package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main (String args []){

        Supplier<String>  s = ()-> "RaviBaba";
       System.out.println(s.get());

       List<String>  asList = Arrays.asList();
       System.out.println(asList.stream().findAny().orElseGet(() ->"Ravi bhai"));
    }
}
