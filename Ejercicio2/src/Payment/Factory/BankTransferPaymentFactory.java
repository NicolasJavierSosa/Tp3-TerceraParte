package Payment.Factory;
import pago.PaymentFactory;
import pago.pago;
import Payment.method.BankTransferPayment;

    /**
     * Clase BankTransferPaymentFactory.
     * Implementa el método createPayment para devolver una instancia de BankTransferPayment.
     * 
     *  
     */
public class BankTransferPaymentFactory extends PaymentFactory {

    @Override
    public pago createPayment() {
        return new BankTransferPayment();
    }

}
