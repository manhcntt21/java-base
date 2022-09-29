package i;

import java.util.List;

/**
 * @author manhdt14
 * created in 9/29/2022 7:49 AM
 */
public interface Payment {
    // bank
    void initiatePayments();
    Object status();
    List<Object> getPayments();
    // loan
    void intiateLoanSettlement();
    void initiateRePayment();
}
