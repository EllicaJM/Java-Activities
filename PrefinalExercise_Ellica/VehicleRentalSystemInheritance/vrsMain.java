/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VehicleRentalSystemInheritance;

/**
 *
 * @author User
 */
public class vrsMain {
    



    public static void main(String[] args) {

        VRS[] vehicles = {
            new Car("C001", "Toyota", "Vios", 7),
            new Motorcycle("M001", "Honda", "Click 125", 3),
            new Van("V001", "Toyota", "Hiace", 2)
        };

        System.out.println("===== VEHICLE RENTAL =====");
        System.out.println();

        for (VRS vehicle : vehicles) {
            vehicle.displayVehicleInfo();
            System.out.println();
        }
    }
}

