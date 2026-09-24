/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrefinalExercise_Ellica;

/**
 *
 * @author User
 */
public class wbmsMain {
    public static void main(String[] args) {
         WBMS customer1 = new WBMS(
                "W-1001",
                "Maria Santos",
                "Residential",
                120,
                145
        );
         WBMS customer2 = new WBMS(
                 "W-1002",
                "Johnny yes papa",
                "Residential",
                200,
                215
         );
          WBMS customer3 = new WBMS(
                 "W-1002",
                "News MPC",
                "Residential",
                300,
                340
                  
                  
         );
          customer1.displayBill();
          customer2.displayBill();
          customer3.displayBill();
          
    }
}
