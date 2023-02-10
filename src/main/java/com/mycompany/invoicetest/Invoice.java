package com.mycompany.invoicetest;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tikad
 */

public class Invoice {
   private String partNumber;
   private String partDescription;
   private  int itemQuantity;
   private double pricePerItem;
    
    public Invoice (String partNumber, String partDescription,int itemQuantity, double pricePerItem ){
    
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        
        if (itemQuantity  >0){
            this.itemQuantity = itemQuantity ;
        }
        
        if (pricePerItem  >0){
           this.pricePerItem = pricePerItem; 
        }
    }
    
    
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        if (itemQuantity  >0){
            this.itemQuantity = itemQuantity;
        }
        
    }

    public double getPricePerItem() {
       
        return pricePerItem;
        
    }

    public void setPricePerItem(double pricePerItem) {
        
         if (pricePerItem  >0){
            this.pricePerItem = pricePerItem;
         }
    }
    public double getInvoiceAmmount (int itemQty, double itemPrice){
        return itemQty * itemPrice; 

    }
}
                   