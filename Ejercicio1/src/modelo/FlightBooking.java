package modelo;

import java.util.ArrayList;
import java.util.List;
/**
 * Clase que representa una reserva de vuelo.
 */
public class FlightBooking {
    private String seatSelection;
    private int additionalBaggage;
    private String specialMeal;
    private List<String> premiumServices;
    /**
     * Constructor de la clase.
     */
    public FlightBooking() {
        this.premiumServices = new ArrayList<>();
    }

    // Getters y Setters
    public void setSeatSelection(String seatSelection) {
        this.seatSelection = seatSelection;
    }

    public void setAdditionalBaggage(int additionalBaggage) {
        this.additionalBaggage = additionalBaggage;
    }

    public void setSpecialMeal(String specialMeal) {
        this.specialMeal = specialMeal;
    }

    public void addPremiumService(String service) {
        this.premiumServices.add(service);
    }

    @Override
    public String toString() {
        return "FlightBooking{" +
                "seatSelection='" + seatSelection + '\'' +
                ", additionalBaggage=" + additionalBaggage +
                ", specialMeal='" + specialMeal + '\'' +
                ", premiumServices=" + premiumServices +
                '}';
    }    
}
