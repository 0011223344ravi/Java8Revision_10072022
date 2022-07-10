package OptionalDemo;

import Map.Customer;

import java.util.List;
import java.util.Optional;

import static Map.CustomerDto.listOfCustomer;

public class OptionalDemoExample {



public static void main (String args []){
    List<Customer> customerList=  listOfCustomer();
    Customer customer  =  new Customer(1,"Ravi" ,"ravi@gmail.com" ,10000);
    Customer customer1 =  new Customer(2,"Ragi" ,"ragi@gmail.com" ,10000);
    Customer customer2 =  new Customer(2,null,"ragi@gmail.com" ,10000);
    Optional<Object > emptyOptional = Optional.empty();
    Optional<String > email = Optional.ofNullable(customer.getEmail());
    Optional<String > Name = Optional.ofNullable(customer1.getName());
    Optional<String > Name1 = Optional.ofNullable(customer2.getName());

    System.out.println(emptyOptional);
    System.out.println(email);
    System.out.println(Name);
    System.out.println(Name1.orElse("ABC"));




}

}
