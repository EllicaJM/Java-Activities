/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VehicleRentalSystemInheritance;

/**
 *
 * @author User
 */


public class Motorcycle extends VRS {

    public Motorcycle(String vehicleId, String brand, String model, double rentalDays) {
        super(vehicleId, brand, model, rentalDays);
    }

    @Override
    public double calculateRental() {
        return (getRentalDays() * 700) + 100;
    }
}

