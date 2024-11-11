import pago.PaymentFactory;
import pago.pago;
import Payment.Factory.CreditCardPaymentFactory;
import Payment.Factory.PayPalPaymentFactory;
import Payment.Factory.BankTransferPaymentFactory;

    /**
     * Clase principal PaymentSystem.
     */
public class PaymentSystem {
    /**
     * Método principal.
     * @param args Argumentos de la línea de comandos.
     * @return void
     */
    public static void main(String[] args) {
        
        PaymentFactory factory = new CreditCardPaymentFactory();
        pago payment = factory.createPayment();
        payment.processPayment();

        factory = new PayPalPaymentFactory();
        payment = factory.createPayment();
        payment.processPayment();

        factory = new BankTransferPaymentFactory();
        payment = factory.createPayment();
        payment.processPayment();
    }
}
