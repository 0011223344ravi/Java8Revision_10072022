package Map;

import java.util.List;

import static Map.CustomerDto.listOfCustomer;

public class MapExample {

    public static void main (String args []){


        List<Customer> customerList=  listOfCustomer();
        customerList.stream().map(custName ->custName.getName()).forEach(t->System.out.println(t));


        customerList.stream().map(g->g.getId()).forEach(t->System.out.println(t));
        int sum  =customerList.stream().map(f->f.getSalary()).reduce(0,(a,b)->a+b);

        System.out.print(sum);


    }
}
