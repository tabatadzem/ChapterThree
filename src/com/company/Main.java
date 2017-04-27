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


//        Scanner input = new Scanner(System.in);
//        int x = (int) (Math.random()*100);
//        System.out.println("please enter thenumber");
//        int y = input.nextInt();
//        int digit1= x/10;
//        int digit2=x%10;
//        int guessDigit1= y/10;
//        int guessDigit2 = y%10;
//
//        if (x == y){
//            System.out.println("you won $10,000.");
//        }
//        else if (guessDigit2 == digit1 && guessDigit1 == digit2){
//            System.out.println("You won $3000 ");
//        }
//        else if ((digit1 ==guessDigit1)||(digit2==guessDigit2)||(digit2==guessDigit1)||(digit2==guessDigit1)){
//            System.out.println("you won $1,000.");
//        }
//
//        else System.out.println("you lost");
//        System.out.println(x);


//
//      Scanner input = new Scanner(System.in);
//      int day = input.nextInt();
//      switch (day){
//          case 1: System.out.print("Monday"); break;
//          case 2: System.out.print("Tuesday"); break;
//          case 3: System.out.print("wednesday"); break;
//          case 4: System.out.print("thursday"); break;
//          case 5: System.out.print("friday"); break;
//          case 6: System.out.print("saturday"); break;
//          case 7: System.out.print("sunday"); break;}
//
//       Scanner input = new Scanner(System.in);
//       System.out.print("please enter the values for a,b and c");
//       double a = input.nextDouble();
//       double b = input.nextDouble();
//       double c = input.nextDouble();
//       double discriminant = b*b-4*a*c;
//       double root1=(-b+Math.pow((discriminant),0.5))/2*a;
//       double root2 = (-b-Math.pow((discriminant),0.5))/2*a;
//       if (discriminant > 0){
//           System.out.println("equation has two roots:" + root1 +"and " + root2);
//       }
//       else if (discriminant == 0){
//           System.out.println("equation has one roots:" + root1 );
//       }
//       else System.out.print("equation has nor roots");

//       Scanner input = new Scanner(System.in);
//       int x = (int) (Math.random()*1000);
//       int y = (int) (Math.random()*1000);
//
//       if (x < y){
//           int temp;
//           temp = x ;
//           x=y;
//           y = temp;
//       }
//        System.out.println("type the answer for " + x +"-" +y);
//           int answer = input.nextInt();
//       if (x-y == answer){
//           System.out.println("you are right");
//       }

//        Scanner input = new Scanner(System.in);
//        System.out.println("please enter the numbers");
//        double a = input.nextDouble();
//        double b = input.nextDouble();
//        double c = input.nextDouble();
//        double d = input.nextDouble();
//        double e = input.nextDouble();
//        double f = input.nextDouble();
//        double x, y;
//        if (a*d - b*c != 0){
//           x = (e*d - b*f)/(a*d - b*c);
//           y = (a*f - e*c)/(a*d - b*c);
//        System.out.println(x + "and " +y + "are the roots");
//        }
//        else System.out.println("equation has no roots");

        // getRandomMonth();

        //  getTheDay();
        // getDollars();
//        Scanner input = new Scanner(System.in);
//        System.out.println(" please enter three numbers: ");
//        int i = input.nextInt();
//        int j = input.nextInt();
//        int k = input.nextInt();
//        if (i<j){
//            int temp;
//            temp = i;
//            i = j;
//            j = temp;
//        }
//        if (i < k){
//            int temp;
//            temp =i;
//            i=k;
//            k=temp;
//        }
//        if (j<k){
//            int temp;
//            temp = j;
//            j = k;
//            k = temp;
//        }
//        System.out.println(i +" " +j+" " +k);

//        Scanner input = new Scanner(System.in);
//        System.out.println("please enter the 9 digit integer ");
//        int digit =  input.nextInt();
//        int  digitTen;
//        digitTen = (int) (( (digit/100000000) + ((digit/10000000)%10)*2
//                        + ((digit/1000000)%10)*3
//                                        +((digit/100000)%10)*4 + ((digit/10000)%10)*5
//                        + ((digit/1000)%10)*6
//                                        + ((digit/100)%10)*7 +((digit/10)%10)*8 + (digit%10)*9 )*0.11)%10;
//        if (digitTen ==10){
//            System.out.println("your number is "+ digit +"X");
//        }
//        else System.out.println("0"+digit +""+ digitTen);

//        Scanner input = new Scanner(System.in);
//        System.out.println("please enter the month");
//        int month = input.nextInt();
//        System.out.println("please enter the year");
//        int year = input.nextInt();
//        if(year%4==1){
//            switch (month){
//                case 1: System.out.println("january has 31 days");break;
//                case 2: System.out.println("february has 29 days");break;
//                case 3: System.out.println("march has 31 days");break;
//                case 4: System.out.println("April has 30 days");break;
//                case 5: System.out.println("may has 31 days");break;
//                case 6: System.out.println("june has 30 days");break;
//                case 7: System.out.println("july has 31 days");break;
//                case 8: System.out.println("august has 31 days");break;
//                case 9: System.out.println("september has 30 days");break;
//                case 10: System.out.println("october has 31 days");break;
//                case 11: System.out.println("november has 30 days");break;
//                case 12: System.out.println("december has 31 days");break;
//            }
//        } else if(year%4==0){ switch (month){
//            case 1: System.out.println("january has 31 days");break;
//            case 2: System.out.println("february has 28 days");break;
//            case 3: System.out.println("march has 31 days");break;
//            case 4: System.out.println("April has 30 days");break;
//            case 5: System.out.println("may has 31 days");break;
//            case 6: System.out.println("june has 30 days");break;
//            case 7: System.out.println("july has 31 days");break;
//            case 8: System.out.println("august has 31 days");break;
//            case 9: System.out.println("september has 30 days");break;
//            case 10: System.out.println("october has 31 days");break;
//            case 11: System.out.println("november has 30 days");break;
//            case 12: System.out.println("december has 31 days");break;
//        }
//
//        }
//        Scanner input = new Scanner(System.in);
//        System.out.println("please enter three digit number ");
//        int number = input.nextInt();
//        int digit1 = number / 100;
//        int digit3 = number%10;
//        if (digit1 == digit3){
//            System.out.println(number + "is a palindrome");
//        } else System.out.println(number + "is not a palindrome");
//        Scanner input = new Scanner(System.in);
////        int coin = (int) (Math.random()*2);
////        System.out.println("please enter your answer, 0 or 1");
////        int answer= input.nextInt();
////        if ((answer==coin)){
////            System.out.println("you won");
////        } else System.out.println("you lost");


//        getLotteryNumber();

        // getCoordinates();

//        Scanner input = new Scanner(System.in);
//        int x = (int) (Math.random() * 3);
//        System.out.println("please enter the number");
//        int y = input.nextInt();
//        switch (x) {
//            case 0:
//                System.out.println("computer is scissor ");
//                break;
//            case 1:
//                System.out.println("computer is rock ");
//                break;
//            case 2:
//                System.out.println("computer is paper ");
//                break;
//        }
//        switch (y) {
//            case 0:
//                System.out.println("you are scissor ");
//                break;
//            case 1:
//                System.out.println("you are rock ");
//                break;
//            case 2:
//                System.out.println("you are paper ");
//                break;
//        }
//       if (x == y) {
//            System.out.println("it is a tie");
//        }
////               if (x == 0 && y == 1 ){
////            System.out.println("You won ");
////        }
////        if (x == 0 && y == 2) {
////            System.out.println("computer  won ");
////        }
////        if (x == 1 && y == 0) {
////            System.out.println("computer won ");
////        }
////        if (x == 1 && y == 2) {
////            System.out.println("you  won ");
////        }
////        if (x == 2 && y == 0) {
////            System.out.println("you won ");
////        }
////        if (x == 2 && y == 1) {
////            System.out.println("computer won ");
////        }
//
//        if((x>y)^(x == 1 && y == 2)){
//            System.out.println("you won");
//        }
//        if((y>x)^(y == 1 && x == 2)){
//            System.out.println("computer won");
//        }

        Scanner input = new Scanner(System.in);
        System.out.print("please enter the weight");
        double weight = input.nextDouble();
        double cost;
        if (weight <=1 ){
            cost = 3.5;
            System.out.println(cost);
        }else if (weight > 1 && weight <= 3){
            cost = 5.5;
            System.out.println(cost);
        }else if (weight > 3 && weight <= 10){
            cost = 8.5;
            System.out.println(cost);
        }else if (weight > 10 && weight <= 20){
            cost = 10.5;
            System.out.println(cost);
        }else System.out.println("package can not be shipped");

    }
    private static void getCoordinates() {
        int x = (int) (Math.random()*200);
        int y = (int) (Math.random()*100);
        System.out.println(x +" and "+ y);
    }

    private static void getLotteryNumber() {
        Scanner input = new Scanner(System.in);
        int lotteryNumber = (int) (Math.random()*1000);
        System.out.println("please enter the 3 digit number");
        int playersNumber = input.nextInt();
        int x1 = lotteryNumber/100;
        int x2 = (lotteryNumber/10)%10;
        int x3 = lotteryNumber^10;
        int y1 = playersNumber/100;
        int y2 = (playersNumber/10)%10;
        int y3 = playersNumber%10;
        if(playersNumber == lotteryNumber){
            System.out.println("you won $10000");
        }else if(((x1==y1)||(x1==y2)||(x1==y3))&&((x2==y2)||(x2==y3))&&((x3==y2)||(x3==y3)))
        {
            System.out.println("you won $3000");
        }else if (((x1==y1)||(x1==y2)||(x1==y3))||((x2==y2)||(x2 == y3))||((x3==y2)||(x3==y3))){
            System.out.println("you won $1000");
        } else System.out.println("sorry you lost numbers are "+ lotteryNumber);
    }

    private static void getDollars() {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the number");
        double amount = input.nextDouble();
        int remainingAmount = (int) (amount * 100);
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        int numberOfPennies = remainingAmount;
        System.out.println("Your amount " + amount + " consists of");
        if  (numberOfOneDollars == 1) {
            System.out.println(" " + numberOfOneDollars + " dollar");
        } else if (numberOfOneDollars > 1) {
            System.out.println(" " + numberOfOneDollars + " dollars");
        }
        if  (numberOfQuarters == 1) {
            System.out.println(" " + numberOfQuarters + " quarter");
        } else if (numberOfQuarters > 1) {
            System.out.println(" " + numberOfQuarters + " quarters");
        }
        if (numberOfDimes == 1) {
            System.out.println(" " + numberOfDimes + " dime");
        } else if (numberOfDimes > 1) {
            System.out.println(" " + numberOfDimes + " dimes");
        }
        if (numberOfNickels == 1) {
            System.out.println(" " + numberOfNickels + " nickel");
        } else if (numberOfNickels > 1) {
            System.out.println(" " + numberOfNickels + " nickels");
        }
        if (numberOfPennies== 1) {
            System.out.println(" " + numberOfPennies + " pennie");
        } else if (numberOfPennies > 1) {
            System.out.println(" " + numberOfPennies + " pennies");
        }


        System.out.println(" " + numberOfPennies + " pennies");
    }


    private static void getTheDay() {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number for day");
        int today = input.nextInt();
        System.out.println("please enter the number for future day");
        int futureDay = input.nextInt();
        int x=(today + futureDay)%7;
        String day = "";
        switch (x){
            case 0: day ="monday"; break;
            case 1: day ="tuesday"; break;
            case 2: day ="wednesday"; break;
            case 3: day ="thursday"; break;
            case 4: day ="friday"; break;
            case 5: day ="saturday"; break;
            case 6: day ="sunday"; break;

        }
        System.out.print(day);
    }

    private static  String getRandomMonth() {
        int x = (int) (Math.random() * 12);
        String month = "";
        switch (x) {
            case 1:
                month = "Jamuary";
                break;
            case 2:
                month = "february";
                break;
            case 3:
               month = "march";
                break;
            case 4:
                month = "april";
                break;
            case 5:
                month = "may";
                break;
            case 6:
               month = "june";
                break;
            case 7:
                month = "july";
                break;
            case 8:
                month = "august";
                break;
            case 9:
                month = "september";
                break;
            case 10:
                month = "october";
                break;
            case 11:
               month = "november";
                break;
            case 12:
               month = "december";
                break;}

                System.out.println(month);
    return month;




    }


        }










