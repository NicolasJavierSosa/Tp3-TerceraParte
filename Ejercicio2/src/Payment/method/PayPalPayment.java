package Payment.method;
import pago.pago;

    /**
     * Clase PayPalPayment.
     * Implementa el método doPayment para realizar un pago con PayPal.
     * Implementa la interfaz pago.
     */
public class PayPalPayment implements pago {
    @Override
    public void processPayment() {
        System.out.println("Pago realizado con PayPal");
    }

}
