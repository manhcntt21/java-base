/**
 * @author manhdt14
 * created in 12/22/2022 3:05 PM
 */
public class Money {
    public int amount;
    public String currencyCode;

    public Money(int amount, String currencyCode) {
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Override
    public boolean equals(Object o) {
        // reflexive
        // symmetric: x.equals(y) = y.equals(x)
        // transitive: bắc cầu: x.equals(y) và y.equals(z) = x.equals(x)
        // consistent: giá trị của equal thay đổi khi giá trị của thuộc tính thay đổi
        // kiểm tra với chính nó
        if (o == this) return true;
        // kiểm tra một kiểu khác không có liên hệ nào với nó
        if (!(o instanceof Money)) return false;

        // trong trường hợp có mối liện với nhau, theo kiểu extends hoặc implement
        // kiểm tra giá trị của nó
        Money other = (Money) o;
        boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null)
                || (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
        return this.amount == other.amount && currencyCodeEquals;

    }
}
