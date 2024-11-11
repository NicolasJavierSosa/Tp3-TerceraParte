package Payment.Factory;

import pago.PaymentFactory;
import pago.pago;
import Payment.method.PayPalPayment;

    /**
     * Clase PayPalPaymentFactory.
     * Implementa el método createPayment para devolver una instancia de PayPalPayment.
     */
public class PayPalPaymentFactory extends PaymentFactory {
    @Override
    public pago createPayment() {
        return new PayPalPayment();
    }

}
