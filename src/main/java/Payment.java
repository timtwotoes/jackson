
public class Payment implements IJSONCodable {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private long id;

    private PaymentInformationMessage message;

    public PaymentInformationMessage getMessage() {
        return message;
    }

    public void setMessage(PaymentInformationMessage message) {
        this.message = message;
    }
}
