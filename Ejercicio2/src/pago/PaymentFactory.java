package pago;

    /**
    * Clase abstracta PaymentFactory.
    * Proporciona un método para crear instancias de métodos de pago específicos.
    */
public abstract class PaymentFactory {
    /**
     * Método createPayment.
     * Devuelve una instancia de un método de pago específico.
     */
    public abstract pago createPayment();
}