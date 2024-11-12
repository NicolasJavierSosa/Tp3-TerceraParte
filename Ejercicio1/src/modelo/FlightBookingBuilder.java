package modelo;
/**
 * Interfaz que define los métodos para construir una reserva de vuelo.
 */
public interface FlightBookingBuilder {
    /**
     * Reinicia el constructor para una nueva reserva.
     */
    void reset();
    /**
     * Establece la selección de asiento para la reserva.
     *
     * @param seat La selección de asiento (ej: "ventana", "pasillo").
     */
    void buildSeatSelection(String seat);
    /**
     * Establece la cantidad de equipaje adicional para la reserva.
     *
     * @param baggage La cantidad de equipaje adicional.
     */
    void buildAdditionalBaggage(int baggage);
    /**
     * Establece la comida especial para la reserva.
     *
     * @param meal El tipo de comida especial (ej: "vegetariana").
     */
    void buildSpecialMeal(String meal);
    /**
     * Agrega un servicio premium a la reserva.
     *
     * @param service El servicio premium (ej: "acceso a sala VIP").
     */
    void buildPremiumServices(String service);
    /**
     * Devuelve la reserva de vuelo construida.
     *
     * @return La reserva de vuelo completa.
     */
    FlightBooking getResult();
}
