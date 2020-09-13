import java.util.ArrayList;

public class TaxReturn implements IJSONCodable {
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

    public void setPayments(ArrayList<Payment> payments) {
        this.payments = payments;
    }

    private ArrayList<Payment> payments = new ArrayList<>();
}
