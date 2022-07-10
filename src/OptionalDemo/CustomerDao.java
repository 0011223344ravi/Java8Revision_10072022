package OptionalDemo;

import Map.Customer;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDao {

    public static  List<Customer>  listOfCustomer(){

        return Stream.of(new Customer(1,"Ravi" ,"ravi@gmail.com" ,10000),
                new  Customer(2,"Raju" ,"raju@gmail.com" ,2115451),
                new Customer(1,"Rahul" ,"rahul@gmail.com" ,21545)
        ).collect(Collectors.toList());

    }
}