package d.services;

import d.daos.CustomerDao;
import d.entities.Customer;

import java.util.List;
import java.util.Optional;

/**
 * @author manhdt14
 * created in 9/29/2022 8:31 AM
 */
// high-level component
public class CustomerService {
    private final CustomerDao customerDao;

    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public Optional<Customer> findById(int id) {
        return customerDao.findById(id);
    }

    public List<Customer> findAll() {
        return customerDao.findAll();
    }

}

