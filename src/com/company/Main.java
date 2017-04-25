package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//        int number1 = (int)(System.currentTimeMillis() % 10);
//        int number2 = (int)(System.currentTimeMillis() / 7 % 10);
//        Scanner input = new Scanner(System.in);
//        System.out.print("What is " + number1 + " + " + number2 + "? ");
//        int answer = input.nextInt();
//        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));

//    Scanner input = new Scanner(System.in);
//    System.out.println("please enter the radius");
//    int radius = input.nextInt();
//    double area;
//    final double PI = 3.14;
//        if (radius >= 0) {
//            area = radius * radius * PI;
//            System.out.println("The area for the circle of radius " + radius + " is " + area);
//        }

    Scanner input = new Scanner(System.in);
    System.out.println(" please enter any number");
    int number = input.nextInt();
    if (number%5 == 0){
        System.out.println("HiFive");
    }
    if (number%2 == 0){
        System.out.println("HiEven");
    }




    }
}
