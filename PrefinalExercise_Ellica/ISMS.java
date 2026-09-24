/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrefinalExercise_Ellica;

/**
 *
 * @author User
 */


public class ISMS {
    private String planCode;
    private String customerName;
    private double monthlyFee;
    private int monthsSubscribed;

    public ISMS(String planCode, String customerName,
                double monthlyFee, int monthsSubscribed) {
        this.planCode = planCode;
        this.customerName = customerName;
        this.monthlyFee = monthlyFee;
        this.monthsSubscribed = monthsSubscribed;
    }

    // Getters and Setters

    public String getPlanCode() {
        return planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public int getMonthsSubscribed() {
        return monthsSubscribed;
    }

    public void setMonthsSubscribed(int monthsSubscribed) {
        this.monthsSubscribed = monthsSubscribed;
    }

    // Methods

    public double calculateMonthlyBill() {
        return monthlyFee;
    }

    public String getSpeed() {
        return "Unknown";
    }

    public String getPlanDescription() {
        return "Internet Plan";
    }

    public void displayPlan() {
        System.out.println("Plan Code: " + planCode);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Plan: " + getPlanDescription());
        System.out.println("Monthly Fee: \u20B1" + monthlyFee);
        System.out.println("Speed: " + getSpeed());
        System.out.println("Months Subscribed: " + monthsSubscribed);

        System.out.printf("Monthly Bill: \u20B1%.2f%n",
                calculateMonthlyBill());
    }
}


// ================= BASIC PLAN =================

class BasicPlan extends ISMS {

    public BasicPlan(String planCode, String customerName,
                     int monthsSubscribed) {
        super(planCode, customerName, 999, monthsSubscribed);
    }

    @Override
    public double calculateMonthlyBill() {
        if (getMonthsSubscribed() >= 6) {
            return getMonthlyFee() * 0.95;
        }

        return getMonthlyFee();
    }

    @Override
    public String getSpeed() {
        return "50 Mbps";
    }

    @Override
    public String getPlanDescription() {
        return "Basic Plan";
    }
}


// ================= STANDARD PLAN =================

class StandardPlan extends ISMS {

    public StandardPlan(String planCode, String customerName,
                        int monthsSubscribed) {
        super(planCode, customerName, 1499, monthsSubscribed);
    }

    @Override
    public double calculateMonthlyBill() {
        if (getMonthsSubscribed() >= 12) {
            return getMonthlyFee() * 0.90;
        }

        return getMonthlyFee();
    }

    @Override
    public String getSpeed() {
        return "100 Mbps";
    }

    @Override
    public String getPlanDescription() {
        return "Standard Plan";
    }
}


// ================= PREMIUM PLAN =================

class PremiumPlan extends ISMS {

    public PremiumPlan(String planCode, String customerName,
                       int monthsSubscribed) {
        super(planCode, customerName, 2499, monthsSubscribed);
    }

    @Override
    public double calculateMonthlyBill() {
        if (getMonthsSubscribed() >= 12) {
            return getMonthlyFee() * 0.85;
        }

        return getMonthlyFee();
    }

    @Override
    public String getSpeed() {
        return "300 Mbps";
    }

    @Override
    public String getPlanDescription() {
        return "Premium Plan";
    }
}