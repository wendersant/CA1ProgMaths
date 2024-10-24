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
    private String firstName;
    private String surname;
    private double purchaseValue;
    private int customerClass;
    private int year;
    
    private double discount;
   
    //method to get first name from external program
    public String getfirstName(){
        return this.firstName;
    }    
    
    //method to get surname from external program    
    public String getsurname(){
        return this.surname;
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
    
    //method to assign first name from external program
    public void setfirstName(String firstNameAssist){
        this.firstName = firstNameAssist;
        
    }
    
    //method to assign surname from external program
    public void setsurname(String surnameAssist){
        this.surname = surnameAssist; 
    
    }
    
    //method to assign purchase value from external program
    public void setpurchaseValue(double purchaseValueAssist){
        this.purchaseValue = purchaseValueAssist;
    
    }
    
    //method to assign customer class from external program
    public void setcustomerClass(int customerClassAssist){
        this.customerClass = customerClassAssist;
    
    }
            
    //method to assign year from external program       
    public void setyear(int yearAssist){
        this.year = yearAssist;
    
    }
    
    public double getdiscount(){
        return this.discount;
    }
    
    public void setdiscount(double discountAssist){
        this.discount = discountAssist;
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
            
    } else if (customerClass == 3 && year < 2024){
            discount = purchaseValue * 0;
            System.out.println("Applied 0% discount!");
            
    }
        return discount;

    }

    

            
            
    
}