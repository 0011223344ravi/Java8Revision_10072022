package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
public static void main (String args []){
    Consumer<Integer>  interf = a->System.out.println(a);
    interf.accept(10);

    List<Integer>  list = Arrays.asList(1,2,3,4,5);
    list.stream().forEach(t->System.out.println("printing each element of arraylist " +t));


}


}
