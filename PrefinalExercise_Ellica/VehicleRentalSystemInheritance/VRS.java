/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VehicleRentalSystemInheritance;

/**
 *
 * @author User
 */
public class VRS {
     private String vehicleId;
    private String brand;
    private String model;
    private double rentalDays;

    public VRS(String vehicleId, String brand, String model, double rentalDays) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.rentalDays = rentalDays;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(double rentalDays) {
        this.rentalDays = rentalDays;
    }
     public double calculateRental() {
        return 0;
    }
   public void displayVehicleInfo() {
        System.out.println("Vehicle: " + getClass().getSimpleName());
        System.out.println();
        System.out.println("Brand: " + brand);
        System.out.println();
        System.out.println("Model: " + model);
        System.out.println();
        System.out.println("Rental Days: " + (int) rentalDays);
        System.out.println();
        System.out.printf("Rental Cost: ₱%,.2f%n", calculateRental());
        System.out.println();
     
}
}