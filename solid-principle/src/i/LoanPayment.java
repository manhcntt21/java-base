package i;

import java.util.List;

/**
 * @author manhdt14
 * created in 9/29/2022 7:55 AM
 */
public class LoanPayment implements Payment{

    @Override
    public void initiatePayments() {
        throw new UnsupportedOperationException("This is not a bank payment");
    }

    @Override
    public Object status() {
        return null;
    }

    @Override
    public List<Object> getPayments() {
        return null;
    }

    @Override
    public void intiateLoanSettlement() {

    }

    @Override
    public void initiateRePayment() {

    }
}
