/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca1progmaths;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
        
        String[] fds = new String[4];
       
        try { FileReader fr = new FileReader("customers.txt");
             BufferedReader br = new BufferedReader(fr);
            
             String line = "";
             
             while ((line = br.readLine()) != null){
                 System.out.println(line);
             }
           
           
        } catch(IOException e){
            System.out.println("Error ---- file not found");
            e.printStackTrace();
        }
            
     
        
//        double disc;
//        String name;
//        
//        
//        CA1Class ca1 = new CA1Class();
//        
//        // Using setter from CA1 Class
//        ca1.setfullName("You");
//        ca1.setpurchaseValue(300);
//        ca1.setcustomerClass(4);
//        ca1.setyear(2015);
//        
//        name = ca1.getfullName();
//        disc = ca1.calculateDiscount();
//        
//        System.out.println(name + disc);
        
        
    }
    
}
