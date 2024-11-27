package main.java.com.gk.principles.openClosedPrinciple;

public class VehicleNumberValidationService {
    public void validateVehicle(VehicleNumberValidator validator, String vehicleNumber) {
        if (validator.validate(vehicleNumber)) {
            System.out.println(vehicleNumber + " is valid.");
        } else {
            System.out.println(vehicleNumber + " is invalid.");
        }
    }
}
