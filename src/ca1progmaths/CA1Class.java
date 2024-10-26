/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca1progmaths;

/**
 *
 * @author wendersondasilvasantana
 */
public class CA1Class {
    
    //attributes from my class CA1Class    
    private String fullName;
    private double purchaseValue;
    private int customerClass;
    private int year;
    
    double discount;
 
    //method to get full name from external program
    public String getfullName(){
        return this.fullName;
    }      
    
    //method to get purchase value from external program    
    public double getpurchaseValue(){
        return this.purchaseValue;
    }
    
    //method to get customer class from external program
    public int getcustomerClass(){
        return this.customerClass;
    
    }
    
    //method to get year from external program
    public int getyear(){
        return this.year;
    
    }
    
    //method to assign full name from external program
    public void setfullName(String fullNameAssist){
        this.fullName = fullNameAssist;
        
    }
    
    //method to assign purchase value from external program
    public void setpurchaseValue(String purchaseValueAssist){
        try {
            this.purchaseValue = Double.parseDouble(purchaseValueAssist); // it converts to double
            
        
        } catch(IllegalCallerException e) {
            System.out.println("The purchase value is invalid.");
        }
        
    
    }
    
    //method to assign customer class from external program
    public void setcustomerClass(String customerClassAssist){
        try {
            this.customerClass = Integer.parseInt(customerClassAssist); // it converts to integer
            
        } catch(IllegalCallerException e) {
            System.out.println("Class is invalid.");
        }
        
    
    }
            
    //method to assign year from external program       
    public void setyear(String yearAssist){
        try {
            this.year = Integer.parseInt(yearAssist); // it converts to integer
            
        } catch (IllegalCallerException e) {
            System.out.println("Year format is invalid.");
        }
    }
     
    //calculate customer discount
    public double calculateDiscount(){
        if(customerClass == 1 && year == 2024){
            discount = purchaseValue * 0.7; // it calculates 30% discount of the total purchase
            
    } else if (customerClass == 1 && year < 2024 -5){
            discount = purchaseValue * 0.9; // it calculates 10% discount of the total purchase
           
            
    } else if (customerClass == 1 && year < 2024){
            discount = purchaseValue * 0.8; // it calculates 20% discount of the total purchase
           
            
    } else if (customerClass == 2 && year == 2024){
            discount = purchaseValue * 0.85; // it calculates 15% discount of the total purchase
           
            
    } else if (customerClass == 2 && year < 2024 -5){
            discount = purchaseValue * 0.95; // it calculates 5% discount of the total purchase
            
            
    } else if (customerClass == 2 && year < 2024){
            discount = purchaseValue * 0.87; // it calculates 13% discount of the total purchase
            
            
    } else if (customerClass == 3 && year == 2024){
            discount = purchaseValue * 0.97; // it calculates 3% discount of the total purchase
            
            
    } else if (customerClass == 3 && year < 2024){
            discount = purchaseValue;
           
   
    } else if (customerClass != 1 || customerClass != 2 || customerClass != 3){
            discount = 0;
            
    }
        return discount;

    }

    

            
            
    
}