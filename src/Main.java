import jdk.jshell.EvalException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;



        System.out.println("enter the radius: ");
        radius= scanner.nextDouble();

        circumference= 2 * Math.PI * radius;
        area =Math.PI *  Math.pow(radius,2);
        volume = (4.0/3.0)* Math.PI* Math.pow(radius,3);

        System.out.printf("The circumference: %.1fcm\n",circumference);
        System.out.printf("The area: %.1fcm²\n",area);
        System.out.printf("The volume: %.1fcm³\n",volume);
        scanner.close();
    }
    }
