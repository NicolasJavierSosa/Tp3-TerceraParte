package Payment.method;
import pago.pago;

    /**
     * Clase BankTransferPayment.
     * Implementa la interfaz pago.
     * Implementa el método makePayment para realizar un pago con transferencia bancaria.
     */
public class BankTransferPayment implements pago {
    @Override
    public void processPayment() {
        System.out.println("Pago realizado con transferencia bancaria");
    }

}
