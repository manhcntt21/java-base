package d.daoimplementations;

import d.daos.CustomerDao;
import d.entities.Customer;

import java.util.*;


/**
 * @author manhdt14
 * created in 9/29/2022 8:40 AM
 */
public class SimpleCustomerDao implements CustomerDao {
    private Map<Integer, Customer> customers = new HashMap<>();

    public SimpleCustomerDao(Map<Integer, Customer> customers) {
        this.customers = customers;
    }

    @Override
    public Optional<Customer> findById(int id) {
        return Optional.ofNullable(customers.get(id));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }
}
