package d;

import d.daoimplementations.SimpleCustomerDao;
import d.entities.Customer;
import d.services.CustomerService;

import java.util.HashMap;
import java.util.Map;

/**
 * @author manhdt14
 * created in 9/29/2022 9:18 AM
 */
public class MainApplication {
    public static void main(String[] args) {
        Map<Integer, Customer> customers = new HashMap<>();
        customers.put(1, new Customer("John"));
        customers.put(2, new Customer("Susan"));
        CustomerService customerService = new CustomerService(new SimpleCustomerDao(customers));
        customerService.findAll().forEach(System.out::println);
    }
}
