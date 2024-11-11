package Payment.method;
import pago.pago;

    /**
     * Clase CreditCardPayment.
     * Implementa el método makePayment para realizar un pago con tarjeta de crédito.
     * Implementa la interfaz pago.
     */
public class CreditCardPayment implements pago {
    @Override
    public void processPayment() {
        System.out.println("Pago realizado con tarjeta de crédito.");
    }

}
