/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca1progmaths;

/**
 *
 * @author wendersondasilvasantana
 */
public class CA1ProgMaths {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double disc;
        String name, surname;
        
        
        CA1Class ca1 = new CA1Class();
        
        // Using setter from CA1 Class
        ca1.setfirstName("Mia");
        ca1.setsurname("Jowita");
        ca1.setpurchaseValue(1500);
        ca1.setcustomerClass(1);
        ca1.setyear(2024);
        
        name = ca1.getfirstName();
        surname = ca1.getsurname();
        disc = ca1.calculateDiscount();
        
        System.out.println(name +  " " + surname + " will pay " + disc + ".");
        
        
    }
    
}
