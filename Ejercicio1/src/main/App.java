package main;
import modelo.ConcreteFlightBookingBuilder;
import modelo.Director;
import modelo.FlightBooking;
import modelo.FlightBookingBuilder;

public class App {
    public static void main(String[] args) throws Exception {
        // Crear el builder concreto
        FlightBookingBuilder builder = new ConcreteFlightBookingBuilder();
        
        // Crear el director con el builder
        Director director = new Director(builder);
        
        // Construir una reserva simple
        director.constructSimpleBooking();
        FlightBooking simpleBooking = builder.getResult();
        System.out.println("Reserva simple: " + simpleBooking);
        
        // Construir una reserva premium
        director.constructPremiumBooking();
        FlightBooking premiumBooking = builder.getResult();
        System.out.println("Reserva premium: " + premiumBooking);
    }
}
