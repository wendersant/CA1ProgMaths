/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
Link to the GitHub Repository
https://github.com/wendersant/CA1ProgMaths
*/

package ca1progmaths;

import java.io.*;
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
        String fileO = "customerdiscount.txt"; // a file to be created and stored in the same folder
        String[] fds = new String[4]; //an array to store 4 strings 
       
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileP)); // It will read the file stored in the project's folder
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileO)); // This will create a file and it will store the file in the same project's folder
             
             
        String line;
        int lineCount = 0;
        
        // importing CA1Calss from external file 
        CA1Class cust = new CA1Class();
        
        // While loop is used to read the file until last row(null)
             while ((line = br.readLine()) != null){
                 fds[lineCount % 4] = line;
                 System.out.println(line);
                 
                 // it will check the 4 lines assigned and check if there is any error
             if (lineCount % 4 == 3) {
             
                 cust.setfullName(fds[0]);
                 
                 cust.setpurchaseValue(fds[1]);
                 
                 cust.setcustomerClass(fds[2]);
                 
                 cust.setyear(fds[3]);
                 
                 
                double discount = cust.calculateDiscount(); // calculate discount from external program
                 bw.write(cust.getfullName()); // it writes full name on the new file
                 bw.newLine(); // new line is added
                 bw.write(Double.toString(discount)); // it writes the calculated discount on the new file
                 bw.newLine(); // new line added
                 
                 
                 
             }
             
             lineCount++;
             
             }
             
             bw.flush();// it flushes the writer
             bw.close();// it closes BufferedWriter
             br.close();// it closes BufferedReader
             
           
           
        } catch(IOException e){
            System.out.println("Error ---- file not found");
            e.printStackTrace();
        }
            
     
      
        
    }
    
}
