import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        PaymentInformationMessage message = new PaymentInformationMessage();
        Payment firstPayment = new Payment();
        firstPayment.setMessage(message);
        Payment secondPayment = new Payment();
        secondPayment.setMessage(message);
        message.getPayments().add(firstPayment);
        message.getPayments().add(secondPayment);
        TaxReturn taxReturn = new TaxReturn();
        taxReturn.getPayments().add(firstPayment);
        taxReturn.getPayments().add(secondPayment);
        message.getTaxReturns().add(taxReturn);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/two/Desktop/pim.json"));
            writer.write(message.encodeToJSON());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
