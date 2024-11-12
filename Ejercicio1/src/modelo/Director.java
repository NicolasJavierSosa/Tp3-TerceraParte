package modelo;
/**
* Clase director
*/
public class Director {
    private FlightBookingBuilder builder;

    /**
     * Constructor de la clase.
     *
     * @param builder El constructor de la reserva de vuelo.
     */
    public Director(FlightBookingBuilder builder) {
        this.builder = builder;
    }
    /**
     * Cambia el constructor utilizado para construir la reserva.
     *
     * @param builder El nuevo constructor de la reserva de vuelo.
     */
    public void changeBuilder(FlightBookingBuilder builder) {
        this.builder = builder;
    }
    /**
     * Construye una reserva de vuelo simple.
     */
    public void constructSimpleBooking() {
        builder.buildSeatSelection("ventana");
        builder.buildAdditionalBaggage(1);
    }
    /**
     * Construye una reserva de vuelo con servicios premium.
     */
    public void constructPremiumBooking() {
        builder.buildSeatSelection("pasillo");
        builder.buildAdditionalBaggage(2);
        builder.buildSpecialMeal("vegetariana");
        builder.buildPremiumServices("acceso a sala VIP");

    }
}
