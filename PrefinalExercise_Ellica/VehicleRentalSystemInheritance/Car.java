/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VehicleRentalSystemInheritance;

/**
 *
 * @author User
 */

public class Car extends VRS {

    public Car(String vehicleId, String brand, String model, double rentalDays) {
        super(vehicleId, brand, model, rentalDays);
    }

    @Override
    public double calculateRental() {
        double rental = 1500 * getRentalDays();

        if (getRentalDays() >= 7) {
            rental = rental - (rental * 0.10);
        }

        return rental;
    }
}
