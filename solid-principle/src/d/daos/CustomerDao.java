package d.daos;

import d.entities.Customer;

import java.util.List;
import java.util.Optional;

/**
 * @author manhdt14
 * created in 9/29/2022 8:31 AM
 */
public interface CustomerDao {
    Optional<Customer> findById(int id);

    List<Customer> findAll();
}
