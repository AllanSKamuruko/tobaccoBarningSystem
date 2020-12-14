
package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        BarningTobacco();
    }

    public static void BarningTobacco() {
        
        //options available for the stage of curing tobacco
        System.out.println("choose the stage ");

        System.out.println("step 1 colouring");
        System.out.println("step 2 Lamina Drying");
        System.out.println("step 3 mid rib drying");

        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("enter the temperature");
                int temperature = input.nextInt();

                if (temperature < 20) {
                    System.out.println(" temperature is low ");
                    System.out.println("turn heater on and increase the heat to moderate");
                } else if (temperature >= 30 && temperature <= 40) {
                    System.out.println("temperature is ok");
                } else if (temperature > 40 && temperature <= 100) {
                    System.out.println("temperature is high ");
                    System.out.println("automatically turn heater on and lower the heat to moderate");
                } else {
                    System.out.println("there is a fire");
                    System.out.println("shut down everything");
                }
                break;
            case 2:
                System.out.println("enter the temperature");
                temperature = input.nextInt();

                if (temperature < 40) {
                    System.out.println(" temperature is low ");
                    System.out.println("turn heater  on and increase the heat to moderate");
                } else if (temperature >= 40 && temperature <= 50) {
                    System.out.println("temperature is ok");
                } else if (temperature > 50 && temperature <= 100) {
                    System.out.println("temperature is high ");
                    System.out.println("automatically turn heater on and lower the heat to moderate");
                } else {
                    System.out.println("there is a fire");
                    System.out.println("shut down everything");
                }
                break;
            case 3:
                System.out.println("enter the temperature");
                temperature = input.nextInt();

                if (temperature < 65) {
                    System.out.println(" temperature is low ");
                    System.out.println("turn heater on and increase the heat to moderate");
                } else if (temperature >= 65 && temperature <= 70) {
                    System.out.println("temperature is ok");
                } else if (temperature > 70 && temperature <= 100) {
                    System.out.println("temperature is high ");
                    System.out.println("automatically turn heater on and lower the heat to moderate");
                } else {
                    System.out.println("there is a fire ");
                    System.out.println("shut down everything");
                }
                break;
            default:
                System.out.println("not available");
                break;
        }
    }
}