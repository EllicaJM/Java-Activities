/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrefinalExercise_Ellica;

/**
 *
 * @author User
 */
public class EPS {
    private String employeeId;
    private String name;
    private String position;
    private double hoursWork;
    private double hourlyRate;
    
     public EPS(String employeeId, String name, String position, double hoursWork, double hourlyRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.hoursWork = hoursWork;
        this.hourlyRate = hourlyRate;
    }
      public double calculateOvertimePay() {

        if (hoursWork > 40) {
            double overtimeHours = hoursWork - 40;
            double overtimeRate = hourlyRate * 1.50;

            return overtimeHours * overtimeRate;
        }

        return 0;
    }

    // Calculate Gross Pay
    public double calculateGrossPay() {

        double regularHours;

        if (hoursWork > 40) {
            regularHours = 40;
        } else {
            regularHours = hoursWork;
        }

        double regularPay = regularHours * hourlyRate;

        return regularPay + calculateOvertimePay();
    }

    // Calculate Deduction
    public double calculateDeduction() {

        double grossPay = calculateGrossPay();

        if (grossPay <= 10000) {
            return grossPay * 0.05;
        } else {
            return grossPay * 0.10;
        }
    }

    // Calculate Net Pay
    public double calculateNetPay() {

        return calculateGrossPay() - calculateDeduction();
    }

    // Employee Classification
    public String getEmployeeClassification() {

        if (hoursWork < 20) {
            return "Part-Time";
        } else if (hoursWork <= 40) {
            return "Regular";
        } else {
            return "Overtime Worker";
        }
    }

    // Display Payroll
    public void displayPayroll() {

        double regularHours;

        if (hoursWork > 40) {
            regularHours = 40;
        } else {
            regularHours = hoursWork;
        }

        double regularPay = regularHours * hourlyRate;

        System.out.println("================ EMPLOYEE PAYROLL ================");
        System.out.println();

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println();

        System.out.println("Hours Worked: " + hoursWork);
        System.out.printf("Hourly Rate: ₱%.2f%n", hourlyRate);
        System.out.println();

        System.out.printf("Regular Pay: ₱%.2f%n", regularPay);
        System.out.printf("Overtime Pay: ₱%.2f%n", calculateOvertimePay());
        System.out.printf("Gross Pay: ₱%.2f%n", calculateGrossPay());
        System.out.println();

        System.out.printf("Deduction: ₱%.2f%n", calculateDeduction());
        System.out.printf("Net Pay: ₱%.2f%n", calculateNetPay());
        System.out.println();

        System.out.println("Classification: " + getEmployeeClassification());

        System.out.println("==================================================");
    }
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getHoursWork() {
        return hoursWork;
    }

    public void setHoursWork(double hoursWork) {
        this.hoursWork = hoursWork;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    

    
    
   
    
    
    

  
    
  
        
      
      
  
      
  }
    
    
    
    
    
    
    


