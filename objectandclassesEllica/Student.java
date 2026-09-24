/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectandclassesEllica;

/**
 *
 * @author User
 */
public class Student {
    
        String name;
        private int age;
        String program;
        private int yearlvl; 
        
        public Student(){
            
        }
        //parameterized constructor

  
    
   

    public Student(String name, int age) {
        this.name = name;
        this.age = age;    
        this.yearlvl = 1;
    }
    //parameterized constructor
    public Student(String name, int age, String program, int yearlvl){
        this.name = name;
        this.age = age;
        this.program = program;
        this.yearlvl = yearlvl;
    }
    public void setProgram(String program){
        this.program = program;
    }
    public String getProgram(){
        return this.program;
    }
    
    public void setName(String name){
        this.name = name;
        
    }
    void enroll(){
        
    }
    void takeClasses(){
        
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearlvl() {
        return yearlvl;
    }

    public void setYearlvl(int yearlvl) {
        this.yearlvl = yearlvl;
    }

    public String getName() {
        return name;
    }
    

  
}
