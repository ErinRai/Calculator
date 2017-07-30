/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erinrai.calculator;

import java.util.Scanner;

/**
 *
 * @author Erin
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Input First Number: ");
            int a = input.nextInt();
            System.out.println("Input Second Number: ");
            int b = input.nextInt();
            int total=0;
            System.out.println("Enter your choice:");
            System.out.println("1. Add");
            System.out.println("2. Sub");
            System.out.println("3. Mul");
            System.out.println("4. Div");
            System.out.println("5. Exit");
            int choice=input.nextInt();
            switch(choice){
                case 1:
                total= a+b;
                break;
                case 2:
                    total = a-b;
                    break;
                case 3:
                    total=a*b;
                    break;
                case 4:
                    total=a/b;
                    break;
                case 5:
                    System.exit(0);
                    break;        
            }
            System.out.println("Total : " + total );
            System.out.println("Do you want to continue [y/n]:");
            String c=input.next();
            if (c.equalsIgnoreCase("n")){
                System.exit(0);
            }
        }

    }

}
