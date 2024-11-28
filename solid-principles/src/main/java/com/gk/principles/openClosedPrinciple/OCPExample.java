package main.java.com.gk.principles.openClosedPrinciple;

public class OCPExample {
    public static void main(String[] args) {
        /**
         * Open Closed Principle
         * A classes should be open for extension but closed for modification
         * Here, we can add N number for validating vehicle number without modifying existing code.
         */
        VehicleNumberValidationService service = new VehicleNumberValidationService();
        service.validateVehicle(new BikeNumberValidator(), "Bike-9999");
        service.validateVehicle(new CarNumberValidator(), "Cart-8888");
    }
}
