/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.invoicetest;



/**
 *
 * @author tikad
 */
public class InvoiceTest {

    public static void main(String[] args) {
        Invoice invoice1 = new Invoice ("100","keys", 4,5);  
        Invoice invoice2 = new Invoice ("200","locks", 6,15);  
        Invoice invoice3 = new Invoice ("300","nuts", 20,1); 
        Invoice invoice4 = new Invoice ("400","wire25FtRoll", 2,25);   

       
        double totalPrice = 0;
        totalPrice += invoice1.getInvoiceAmmount(invoice1.getItemQuantity(),invoice1.getPricePerItem());
        totalPrice += invoice2.getInvoiceAmmount(invoice2.getItemQuantity(),invoice2.getPricePerItem());
        totalPrice += invoice3.getInvoiceAmmount(invoice3.getItemQuantity(),invoice3.getPricePerItem());
        totalPrice += invoice4.getInvoiceAmmount(invoice4.getItemQuantity(),invoice4.getPricePerItem());

      
      
        System.out.println(totalPrice);

    
    
    
    }
}

