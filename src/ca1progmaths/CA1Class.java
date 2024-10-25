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
    
    private double discount;
 
    //method to get first name from external program
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
    
     //method to get year from external program
     public double getdiscount(){
        return this.discount;
    }
    
    //method to assign first name from external program
    public void setfullName(String fullNameAssist){
        this.fullName = fullNameAssist;
        
    }
    
    //method to assign purchase value from external program
    public void setpurchaseValue(String purchaseValueAssist){
        try {
            this.purchaseValue = Double.parseDouble(purchaseValueAssist);
            
        
        } catch(IllegalCallerException e) {
            System.out.println("The purchase value is invalid.");
        }
        
    
    }
    
    //method to assign customer class from external program
    public void setcustomerClass(String customerClassAssist){
        try {
            this.customerClass = Integer.parseInt(customerClassAssist);
            
        } catch(IllegalCallerException e) {
            System.out.println("Class is invalid.");
        }
        
    
    }
            
    //method to assign year from external program       
    public void setyear(String yearAssist){
        try {
            this.year = Integer.parseInt(yearAssist);
            
        } catch (IllegalCallerException e) {
            System.out.println("Year format is invalid.");
        }
    }
    
     //method to assign year from external program
    public void setdiscount(String discountAssist){
        try {
        this.discount = Double.parseDouble(discountAssist);
        } catch (IllegalCallerException e) {
            System.out.println("Wrong discount.");
                   
        }
    }
    
     //calculate customer discount
    public double calculateDiscount(){
        if(customerClass == 1 && year == 2024){
            discount = purchaseValue * 0.7;
            System.out.println("Applied 30% discount!");
            
    } else if (customerClass == 1 && year < 2024 -5){
            discount = purchaseValue * 0.9;
            System.out.println("Applied 10% discount!");
            
    } else if (customerClass == 1 && year < 2024){
            discount = purchaseValue * 0.8;
            System.out.println("Applied 20% discount!");
            
    } else if (customerClass == 2 && year == 2024){
            discount = purchaseValue * 0.85;
            System.out.println("Applied 15% discount!");
            
    } else if (customerClass == 2 && year < 2024 -5){
            discount = purchaseValue * 0.95;
            System.out.println("Applied 5% discount!");
            
    } else if (customerClass == 2 && year < 2024){
            discount = purchaseValue * 0.87;
            System.out.println("Applied 13% discount!");
            
    } else if (customerClass == 3 && year == 2024){
            discount = purchaseValue * 0.97;
            System.out.println("Applied 3% discount!");
            
    } else if (customerClass == 3 && year < 2024 - 5){
            discount = purchaseValue;
            System.out.println("Sorry, no discount is given for customers who last purchase is more than 5 years.");
    
    } else if (customerClass == 3 && year < 2024){
            discount = purchaseValue;
            System.out.println("Applied 0% discount!");
            
    } else {
            System.out.println("Sorry, the class inserted is not valid. Please select class 1, 2 or 3.");
    
    }
        return discount;

    }

    

            
            
    
}