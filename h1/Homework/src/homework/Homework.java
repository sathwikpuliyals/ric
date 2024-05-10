/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;
import java.util.Scanner;

/**
 *
 * @author sathwik
 */
public class Homework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        //Taking the inputs from the user (length,width)
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        //area,perimeter,diagnol of the perimeter
        double area = length * width;
        double perimeter = 2 * (length + width);
        double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));

        System.out.println("");
        System.out.println("Area of the Rectangle: " + area);
        System.out.println("Perimeter of the Rectangle: " + perimeter);
        System.out.println("Diagonal of the Rectangle: " + diagonal);
    }
    
}
