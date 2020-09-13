import java.util.ArrayList;

public class PaymentInformationMessage implements IJSONCodable {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private long id;

    public ArrayList<Payment> getPayments() {
        return payments;
    }

    private ArrayList<Payment> payments = new ArrayList<>();

    public void setPayments(ArrayList<Payment> payments) {
        this.payments = payments;
    }

    public ArrayList<TaxReturn> getTaxReturns() {
        return taxReturns;
    }

    public void setTaxReturns(ArrayList<TaxReturn> taxReturns) {
        this.taxReturns = taxReturns;
    }

    private ArrayList<TaxReturn> taxReturns = new ArrayList<>();
}
