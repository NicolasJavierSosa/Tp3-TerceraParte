package modelo;
/**
 * Implementación concreta del constructor para una reserva de vuelo.
 */
public class ConcreteFlightBookingBuilder implements FlightBookingBuilder{
    private FlightBooking booking;
    /**
     * Constructor de la clase.
     */
    public ConcreteFlightBookingBuilder() {
        this.reset();
    }
    /**
     * Reinicia el constructor para una nueva reserva.
     */
    @Override
    public void reset() {
        this.booking = new FlightBooking(); // Crea una nueva instancia de FlightBooking
    }
    /**
     * Establece la selección de asiento para la reserva.
     *
     * @param seat La selección de asiento (ej: "ventana", "pasillo").
     */
    @Override
    public void buildSeatSelection(String seat) {
        booking.setSeatSelection(seat);
    }
    /**
     * Establece la cantidad de equipaje adicional para la reserva.
     *
     * @param baggage La cantidad de equipaje adicional.
     */
    @Override
    public void buildAdditionalBaggage(int baggage) {
        booking.setAdditionalBaggage(baggage);
    }
    /**
     * Establece la comida especial para la reserva.
     *
     * @param meal El tipo de comida especial (ej: "vegetariana", "sin gluten").
     */
    @Override
    public void buildSpecialMeal(String meal) {
        booking.setSpecialMeal(meal);
    }
    /**
     * Agrega un servicio premium a la reserva.
     *
     * @param service El servicio premium (ej: "acceso a sala VIP", "embarque prioritario").
     */
    @Override
    public void buildPremiumServices(String service) {
        booking.addPremiumService(service);
    }
    /**
     * Devuelve la reserva de vuelo construida.
     *
     * @return La reserva de vuelo completa.
     */
    @Override
    public FlightBooking getResult() {
        FlightBooking result = this.booking;
        this.reset(); // Reinicia para la siguiente reserva si es necesario
        return result;
    }
}
