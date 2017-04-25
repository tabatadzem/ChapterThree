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

//    Scanner input = new Scanner(System.in);
//    System.out.println(" please enter any number");
//    int number = input.nextInt();
//    if (number%5 == 0){
//        System.out.println("HiFive");
//    }
//    if (number%2 == 0){
//        System.out.println("HiEven");
//    }

//        Scanner input = new Scanner(System.in);
//        System.out.println(" please enter any number");
//        int score = input.nextInt();
//        double pay =10;
//        if (score >= 90){
//        pay = pay + pay *0.03;
//
//        }
//        else {
//            pay = pay + pay*0.001;
//        }
//        System.out.println(pay);
//      Scanner input = new Scanner(System.in);
//
//       int x = input.nextInt();
//       int y = input.nextInt();
//       int z=x+y;
//        if (x==3 & y ==2) {
//            System.out.println(z);}
//        else if (x ==3 & y ==3) {
//            System.out.println(z);}
//        else System.out.println(x);

//        Scanner input = new Scanner(System.in);
//        int score = input.nextInt() ;
//        if (score >= 90.0)
//            System.out.println("A");
//        else if (score >= 80.0)
//            System.out.println("B");
//        else if (score >= 70.0)
//            System.out.println("C");
//        else if (score >= 60.0)
//            System.out.println("D");
//        else
//            System.out.println("F");
//
//        Scanner input = new Scanner(System.in);
//        int number1 = (int) (Math.random()*10 +40);
//        int number2 = (int) (Math.random()*10+10);
//        if (number1 < number2){
//            int temp;
//            temp =number1;
//            number1 = number2;
//            number2 = temp;
//        }
//        System.out.println("pease enter the answer for " + number1 + " - " + number2);
//        int answer= input.nextInt();
//        if(number1 - number2 == answer)
//            System.out.println("you are right");
//        else System.out.println("you are wrong");

        Scanner input = new Scanner(System.in);
        System.out.print("please enter the weight");
        double weightInPounds = input.nextDouble();
        System.out.print("please enter the height");
        double heightInInches = input.nextDouble();
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        double weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;
        double heightInMeters = heightInInches * METERS_PER_INCH;
        double bodyIndex = weightInKilograms/Math.pow(heightInMeters,2);
        if (bodyIndex < 18.5){
            System.out.println("your weight is under the norm and your BMI is: " + bodyIndex);
        }
           else if ((18.5 <= bodyIndex) & (bodyIndex <= 25.5) ){
            System.out.println(" you have a normal weight and your BMI is " + bodyIndex);
        }
           else if ((bodyIndex > 25.5)&(bodyIndex<30.0)){
            System.out.println("you are overweight and your BMI is " + bodyIndex);
        }
        else System.out.println("you are an obese");
    }
}
