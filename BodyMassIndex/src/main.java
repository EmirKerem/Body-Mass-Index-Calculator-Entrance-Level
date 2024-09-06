

import java.util.Scanner;


public class main {
   public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter your weight as kilograms)");
        int mass_for_kilogram = scanner.nextInt();
        
        System.out.println("Please enter your height in meters");
        double height_by_metre = scanner.nextDouble();
        
        double body_mass_index = mass_for_kilogram / (height_by_metre * height_by_metre);
        
        System.out.println("Your Body Mass Index = " + body_mass_index);
    } 
    
}