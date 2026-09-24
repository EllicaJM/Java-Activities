/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrefinalExercise_Ellica;

/**
 *
 * @author User
 */
public class ismsMain {
   

    public static void main(String[] args) {

        System.out.println("========== INTERNET SUBSCRIPTION ==========");

        ISMS basic = new BasicPlan(
                "B-001",
                "Pedro Cruz",
                6
        );

        ISMS standard = new StandardPlan(
                "S-001",
                "Juan Dela Cruz",
                12
        );

        ISMS premium = new PremiumPlan(
                "P-001",
                "Maria Santos",
                15
        );

        basic.displayPlan();

        System.out.println("------------------------------------------");

        standard.displayPlan();

        System.out.println("------------------------------------------");

        premium.displayPlan();

        System.out.println("==========================================");
    }
}

