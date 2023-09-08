/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

/**
 *
 * @author TRUTH
 */
public class Exercise1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String name1 = "Acer Laptop Swift X: ";
        double mass1 = 1390;
        double age1 = 2021;
        double price1 = 46150;
                
        System.out.println( "Laptop: " + name1);
        System.out.println("Price: " + price1);
        System.out.println("Mass: " + mass1);
        System.out.println("Age: " + age1 + "\n");
        
        String name2 = "Logitech G102 Mouse: ";
        double mass2 = 85;
        double age2 = 2016;
        double price2 = 950;
                
        System.out.println( "Mouse: " + name2);
        System.out.println("Price: " + price2);
        System.out.println("Mass: " + mass2);
        System.out.println("Age: " + age2 + "\n");
        
        String name3 = "Redragon K530 Keyboard: ";
        double mass3 = 470;
        double age3 = 2014;
        double price3 = 2195;
                
        System.out.println( "Keyboard: " + name3);
        System.out.println("Price: " + price3);
        System.out.println("Mass: " + mass3);
        System.out.println("Age: " + age3 + "\n");
        
        double sum1 = price1 + price2 + price3;
        double sum2 = mass1 + mass2 + mass3;
        boolean bool1 = age3 < age1;
        System.out.println( "Total Price of Setup: " + sum1);
        System.out.println( "Total Mass of Setup: " + sum2);
        System.out.println( "The Redragon K530 Keyboard is the oldest: " + bool1);

    }
    
}
