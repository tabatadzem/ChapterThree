package com.company;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


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

//
//        Scanner input = new Scanner(System.in);
//        System.out.println("please enter the status 0, 1, 2, or 3");
//        int status = input.nextInt();
//        if ((status >= 0) & (status <= 3)) {
//            System.out.println("please enter your income");
//            double income = input.nextDouble();
//            double tax = 0;
//            if (status == 0) {
//                if (income <= 8350) {
//                    tax = income * 0.10;
//                } else if (income <= 33950) {
//                    tax = 8350 * 0.10 + (income - 8350) * 0.15;
//                } else if (income <= 82250) {
//                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
//                } else if (income <= 171550) {
//                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
//                } else if (income <= 372950) {
//                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
//                            (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
//                            (income - 171550) * 0.33;
//                } else tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
//                        (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
//                        (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
//            }
//
//            if (status == 1) {
//                if (income <= 16700) {
//                    tax = income * 0.10;
//                } else if (income <= 67900) {
//                    tax = 16700 * 0.10 + (income - 16700) * 0.15;
//                } else if (income <= 137050) {
//                    tax = 16700 * 0.10 + (67901 - 16700) * 0.15 + (income - 67901) * 0.25;
//                } else if (income <= 208850) {
//                    tax = 16700 * 0.10 + (137051 - 16700) * 0.15 +
//                            (137051 - 67901) * 0.25 + (income - 137051) * 0.28;
//                } else if (income <= 372950) {
//                    tax = 16700 * 0.10 + (33950 - 16700) * 0.15 +
//                            (137050 - 67901) * 0.25 + (208850 - 137050) * 0.28 +
//                            (income - 208851) * 0.33;
//                } else tax = 16700 * 0.10 + (33950 - 16700) * 0.15 +
//                        (137050 - 67901) * 0.25 + (208850 - 137050) * 0.28 +
//                        (372950 - 208851) * 0.33 + (income - 372950) * 0.35;
//            }
//
//            if (status == 2) {
//                if (income <= 8350) {
//                    tax = income * 0.10;
//                } else if (income <= 33950) {
//                    tax = 8350 * 0.10 + (income - 8350) * 0.15;
//                } else if (income <= 68525) {
//                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
//                } else if (income <= 104425) {
//                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (income - 68526) * 0.28;
//                } else if (income <= 186475) {
//                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
//                            (68525 - 33950) * 0.25 + (104425 - 68526) * 0.28 +
//                            (income - 104426) * 0.33;
//                } else tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
//                        (68525 - 33950) * 0.25 + (104425 - 68526) * 0.28 +
//                        (186475 - 104426) * 0.33 + (income - 186475) * 0.35;
//            }
//            if (status == 3) {
//                if (income <= 11950) {
//                    tax = income * 0.10;
//                } else if (income <= 45500) {
//                    tax = 11950 * 0.10 + (income - 11950) * 0.15;
//                } else if (income <= 117450) {
//                    tax = 11950 * 0.10 + (45500 - 11951) * 0.15 + (income - 11951) * 0.25;
//                } else if (income <= 190200) {
//                    tax = 11950 * 0.10 + (45500 - 11951) * 0.15 + (117450 - 45501) * 0.25 + (income - 117451) * 0.28;
//                } else if (income <= 372950) {
//                    tax = 11950 * 0.10 + (45500 - 11951) * 0.15 +
//                            (117450 - 45501) * 0.25 + (190200 - 117451) * 0.28 +
//                            (income - 190200) * 0.33;
//                } else tax = 8350 * 0.10 + (45500 - 11951) * 0.15 +
//                        (117450 - 45501) * 0.25 + (190200 - 117451) * 0.28 +
//                        (372950 - 190200) * 0.33 + (income - 372950) * 0.35;
//            }
//            System.out.println(" your tax for year is " + tax);
//        } else if (status > 3) {
//            System.out.print("wrong status");

//        Scanner input = new Scanner(System.in);
//        System.out.println("please enter the number");
//        int number = input.nextInt();
//        if((number%2==0)&&(number%3==0)){
//            System.out.println("the number is multiples 3 and 2");
//        }
//
//        if((number%2==0)^ (number%3==0)){
//            System.out.println("number has multiple or 3 or 2");
//        }
//       if ((number%2==0)||(number%3==0)){
//            System.out.println("number has multiple 3 or 2");
//        }


        Scanner input = new Scanner(System.in);
        int x = (int) (Math.random()*100);
        System.out.println("please enter thenumber");
        int y = input.nextInt();
        int digit1= x/10;
        int digit2=x%10;
        int guessDigit1= y/10;
        int guessDigit2 = y%10;

        if (x == y){
            System.out.println("you won $10,000.");
        }
        else if (guessDigit2 == digit1 && guessDigit1 == digit2){
            System.out.println("You won $3000 ");
        }
        else if ((digit1 ==guessDigit1)||(digit2==guessDigit2)||(digit2==guessDigit1)||(digit2==guessDigit1)){
            System.out.println("you won $1,000.");
        }

        else System.out.println("you lost");
        System.out.println(x);




       }



    }



