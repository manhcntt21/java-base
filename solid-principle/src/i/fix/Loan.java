package i.fix;

/**
 * @author manhdt14
 * created in 9/29/2022 7:57 AM
 */
public interface Loan extends Payment{
    void intiateLoanSettlement();
    void initiateRePayment();
}
