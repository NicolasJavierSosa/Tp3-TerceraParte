package Payment.Factory;
import pago.PaymentFactory;
import pago.pago;
import Payment.method.CreditCardPayment;

    /**
     * Clase CreditCardPaymentFactory.
     * Implementa el método createPayment para devolver una instancia de CreditCardPayment.
     */
public class CreditCardPaymentFactory extends PaymentFactory {

    @Override
    public pago createPayment() {
        return new CreditCardPayment();
    }

}
