/**
 * @author manhdt14
 * created in 12/22/2022 9:17 PM
 */
public class MoneyHashCode {
    public Integer amount;
    public String currencyCode;

    public MoneyHashCode(int amount, String currencyCode) {
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
        if (!(o instanceof MoneyHashCode)) return false;

        // trong trường hợp có mối liện với nhau, theo kiểu extends hoặc implement
        // kiểm tra giá trị của nó
        MoneyHashCode other = (MoneyHashCode) o;
        boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null)
                || (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
        return this.amount == other.amount && currencyCodeEquals;
    }

    @Override
    public int hashCode() {
        int result = 17;
        if (amount != null) {
            result = 31 * result + amount.hashCode();
        }
        if (currencyCode != null) {
            result = 31 * result + currencyCode.hashCode();
        }
        return result;
    }
}
