/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrefinalExercise_Ellica;

/**
 *
 * @author User
 */
public class SGMS {
    // Private properties
    private String studentId;
    private String name;
    private String course;
    private double prelimGrade;
    private double midtermGrade;
    private double finalGrade;

    // Constructor
    public SGMS(String studentId, String name, String course,
                double prelimGrade, double midtermGrade, double finalGrade) {

        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.prelimGrade = prelimGrade;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public double getPrelimGrade() {
        return prelimGrade;
    }

    public double getMidtermGrade() {
        return midtermGrade;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    // Setters
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setPrelimGrade(double prelimGrade) {
        this.prelimGrade = prelimGrade;
    }

    public void setMidtermGrade(double midtermGrade) {
        this.midtermGrade = midtermGrade;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }

    // Calculate Average
    public double calculateAverage() {
        return (prelimGrade + midtermGrade + finalGrade) / 3;
    }

    // Get Classification
    public String getClassification() {

        double average = calculateAverage();

        if (average >= 90) {
            return "Excellent";
        } else if (average >= 85) {
            return "Very Good";
        } else if (average >= 80) {
            return "Good";
        } else if (average >= 75) {
            return "Passing";
        } else {
            return "Failed";
        }
    }

    // Display Student Information
    public void displayStudentInfo() {

        double average = calculateAverage();

        System.out.println("========== STUDENT INFORMATION ===========");
        System.out.println();
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println(" ");
        System.out.println("Prelim Grade: " + prelimGrade);
        System.out.println("Midterm Grade: " + midtermGrade);
        System.out.println("Final Grade: " + finalGrade);
        System.out.println(" ");
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Classification: " + getClassification());

        if (average >= 75) {
            System.out.println("Status: PASSED");
        } else {
            System.out.println("Status: FAILED");
        }
    }
}
