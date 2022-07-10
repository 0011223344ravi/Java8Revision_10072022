package SortListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListUsingJava8 {

    public static void main(String args []){

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().sorted(Comparator.reverseOrder()).forEach(t->System.out.println("printing element " +t));
        System.out.println();
        list.stream().sorted().forEach(t->System.out.println("printing element " +t));

    }
}
