/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectandclassesEllica;

/**
 *
 * @author User
 */
public class Mainclass {
    
       public static void main(String[] args) {
        Student s1 = new Student("Mark", 21);
        Student s2 = new Student("Juan", 25);
        Student s3 = new Student("Bingo", 21, "BSBA", 4);
        
        System.out.println(s1.getName());
        System.out.println(s2.getName());
        System.out.println(s3.getProgram());
        System.out.println(s1.getYearlvl());
        
        s1.setName("Mark Kent");
        System.out.println(s1.getName());
    }
            
}

