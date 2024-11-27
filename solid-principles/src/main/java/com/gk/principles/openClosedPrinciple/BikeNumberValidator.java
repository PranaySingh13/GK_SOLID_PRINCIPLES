package main.java.com.gk.principles.openClosedPrinciple;

// Adding a new vehicle type is easy without modifying existing code
public class BikeNumberValidator implements VehicleNumberValidator {
    @Override
    public boolean validate(String vehicleNumber) {
        return vehicleNumber.startsWith("Bike-");
    }
}
