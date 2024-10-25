/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca1progmaths;

import java.io.BufferedWriter;
import java.io.FileWriter;
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
        
        String fileP = "customers.txt"; //a file stored in the project folder
        String fileO = "customerdiscount.txt"; // a file to be created 
        String[] fds = new String[4];
       
        try {FileReader fr = new FileReader(fileP); // it will read the file
             BufferedReader br = new BufferedReader(fr); // wrapper around another reader
             FileWriter fw = new FileWriter(fileO); // this will write a file
             BufferedWriter bw = new BufferedWriter(fw); // it uses internal buffer to write data in the file
             
             
        String line ="";
        int lineCount = 0;
        
        
        CA1Class cust = new CA1Class();
        
        // While loop is used 
             while ((line = br.readLine()) != null){
                 fds[lineCount % 4] = line;
                 System.out.println(line);
                 
             if (lineCount % 4 ==3) {
             
                 cust.setfullName(fds[0]);
                 
                 cust.setpurchaseValue(fds[1]);
                 
                 cust.setcustomerClass(fds[2]);
                 
                 cust.setyear(fds[3]);
                 
                 
                 double discount = cust.calculateDiscount();
                 bw.write(cust.getfullName());
                 bw.newLine();
                 bw.write(Double.toString(discount));
                 
                 
                 
             }
             
             lineCount++;
             
             }
             
             bw.flush();
             bw.close();
             br.close();
             
           
           
        } catch(IOException e){
            System.out.println("Error ---- file not found");
            e.printStackTrace();
        }
            
     
      
        
    }
    
}
