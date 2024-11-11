# Trabajo Práctico 3 
## Tercera Parte: Patrones de Diseño 
## Programación Orientada a Objetos II 
_**Objetivo**_: Implementar soluciones para problemas comunes utilizando los patrones de 
diseño Builder, Factory Method, Singleton. Cada solución debe incluir un diagrama UML y 
el código en Java que represente el patrón solicitado. 
### 1. Patrón Builder - Gestión de Vuelos 
**Enunciado**: Estás trabajando en un sistema de reservas para vuelos. El sistema debe 
permitir a los usuarios personalizar su experiencia de vuelo agregando opciones como 
selección de asiento, equipaje adicional, comidas especiales y acceso a servicios premium. 
Necesitas implementar una clase FlightBookingBuilder que permita a los usuarios configurar 
su reserva de vuelo con las opciones que deseen y luego construirla.

**Tareas**: 
- Implementar el patrón Builder para crear una reserva de vuelo con diferentes 
configuraciones, como selección de asiento, equipaje adicional, comidas especiales 
y servicios premium. 
- La clase FlightBooking debe tener atributos como: asiento seleccionado, cantidad de 
equipaje, tipo de comida y servicios premium. 
- El cliente debe poder crear una reserva de vuelo personalizada utilizando el 
FlightBookingBuilder.
---
### 2. Patrón Factory Method – Gestión de Pagos 
**Enunciado**: Una empresa de servicios de pago en línea necesita crear un sistema que 
permita a los usuarios realizar transacciones utilizando diferentes métodos de pago (tarjeta 
de crédito, PayPal, transferencia bancaria). Dependiendo del método de pago que elija el 
usuario, el sistema debe instanciar la clase adecuada para procesar el pago. Implementa el 
patrón Factory Method para manejar la creación de diferentes métodos de pago.

**Tareas**: 
- Implementar una clase abstracta PaymentFactory que decida qué clase de 
procesamiento de pago utilizar (tarjeta de crédito, PayPal o transferencia bancaria). 
- Crear las clases concretas CreditCardPaymentFactory, PayPalPaymentFactory y 
BankTransferPaymentFactory que devuelvan los métodos de pago específicos. 
- Las clases de métodos de pago (CreditCardPayment, PayPalPayment, 
BankTransferPayment) deben implementar la interfaz Payment.
---
### 3. Patrón Singleton – Sistema de Logging 
**Enunciado**: Estás desarrollando un sistema de logging para una aplicación que registra 
todos los eventos importantes. Debes garantizar que solo exista una única instancia de la 
clase Logger a lo largo de la aplicación para asegurar que todos los eventos se registren en 
un único archivo de log. Esta clase debe ser accesible desde cualquier parte del programa.

**Tareas**: 
- Implementar el patrón Singleton para asegurar que solo exista una instancia de 
Logger. 
- La clase Logger debe permitir registrar mensajes de error, advertencia e 
información. 
- Simular múltiples procesos en la aplicación que intenten escribir en el archivo de 
log desde diferentes lugares.
