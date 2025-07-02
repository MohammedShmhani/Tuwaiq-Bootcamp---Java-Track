import java.util.Scanner;

public class Java_Bootcamp_Day9_ExerciseExceptions {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        //*****************************************************************************************************

        //                                            Exception

        //*****************************************************************************************************


        //-----------------------------------------------------------------------------------------------------------


        //Ex 1

//        try {
//            System.out.print("Input first number: ");
//            int num1 = input.nextInt();
//            System.out.print("Input second number: ");
//            int num2 = input.nextInt();
//            mathOperations(num1, num2);
//
//        } catch (ArithmeticException e) {
//            System.out.println("Divide on 0 undefined");
//        } catch (InputMismatchException e) {
//            System.out.println("Invlid input");
//        } catch (Exception e) {
//            System.out.println("There is an error");
//        }


        //-----------------------------------------------------------------------------------------------------------


        //Ex2
//
//        int num1 = 0;
//        System.out.print("Input a number:");
//        try {
//            num1 = input.nextInt();
//            for (int i = 1; i <= 10; i++)
//                System.out.println(num1 + " * " + i + " = " + (num1 * i));
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input");
//        } catch (Exception e) {
//            System.out.println("There is an Error");
//        }


        //-----------------------------------------------------------------------------------------------------------


        //Ex3
//
//
//        System.out.print("Enter the Radios of circule :");
//
//        try {
//            double radius = input.nextDouble();
//            circleCalculations(radius);
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input");
//        } catch (Exception e) {
//            System.out.println("A radius can not be in negative ");
//        }


        //-----------------------------------------------------------------------------------------------------------

        //Ex4


//
//        System.out.println("Enter the count of numbers:");
//        try {
//
//            int count = input.nextInt(), num = 0;
//            if (count < 0)
//                throw new Exception("Cont cant be nigitive");
//            double sum = 0;
//            double avg;
//            for (int i = 1; i <= count; i++) {
//                System.out.println("Enter an integer: ");
//                num = input.nextInt();
//                sum += num;
//
//            }
//            if(count==0)
//                throw new ArithmeticException();
//            System.out.println("The average is: " + (sum / count));
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input");
//        } catch (ArithmeticException e) {
//            System.out.println("Count can not be zero");
//        } catch (Exception e) {
//            System.out.println("Count can not be nigitive");
//        }


        //-----------------------------------------------------------------------------------------------------------


        //Ex5

//
//        try {
//
//
//            System.out.print("Input the first number : ");
//            int num1 = input.nextInt();
//            System.out.print("Input the second number : ");
//            int num2 = input.nextInt();
//            System.out.print("Input the third number : ");
//            int num3 = input.nextInt();
//            boolean b = false;
//            if ((num1 + num2) == num3) {
//                b = true;
//                System.out.print("The result is: " + b);
//            } else {
//                b = false;
//                System.out.print("The result is: " + b);
//
//            }
//            System.out.println();
//            System.out.print("----------------------------");
//            System.out.println();
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input");
//        } finally {
//            System.out.println("Thank you");
//        }

        //-----------------------------------------------------------------------------------------------------------


        //Ex 6

        // There is no exception here
//
//        System.out.print("Input a word: ");
//        String word = input.nextLine();
//        StringBuilder res = new StringBuilder();
//        res.append(word);
//        System.out.print("Reverse word: " + res.reverse());
//
//        System.out.println("Inavlaid input");
//

        //-----------------------------------------------------------------------------------------------------------

        //Ex 7
//
//        try {
//            System.out.println("Enter a number: ");
//            int num = input.nextInt();
//            if (num % 2 == 0)
//                System.out.println("The number is Even");
//            else
//                System.out.println("The number is Odd ");
//        }catch (InputMismatchException e){
//            System.out.println("Invalid input");
//        }

        //-----------------------------------------------------------------------------------------------------------


        //Ex 8

//        try {
//            System.out.println("Enter  temperature in Centigrade: ");
//            double temp = input.nextDouble();
//            System.out.println("Temperature in Fahrenheit is: " + ((temp * 1.8) + 32));
//        }catch (InputMismatchException e){
//            System.out.println("Invalid input");
//        }


        //-----------------------------------------------------------------------------------------------------------

        //Ex 9
//
//        try {
//            System.out.print("Input a string: ");
//            String s = input.nextLine();
//            System.out.print("Input a number: ");
//            int num = input.nextInt();
//            if (num < 0)
//                throw new Exception("index can not be nigitive");
//            System.out.println(s.charAt(num));
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input ");
//        } catch (StringIndexOutOfBoundsException e) {
//            System.out.println("Index out of range ");
//        } catch (Exception e) {
//            System.out.println("Index can not be nigitive");
//        }


        //-----------------------------------------------------------------------------------------------------------


        //Ex 10
//
//        try {
//            System.out.println("Width =");
//            double width = input.nextDouble();
//            System.out.println("Height =");
//            double highit = input.nextDouble();
//            if(width<0 || highit<0)
//                throw new Exception("");
//            System.out.println("Area is " + width + " * " + highit + " = " + (width * highit) +
//                    "\nPerimeter is 2 * (" + width + " + " + highit + " ) = " + (2 * (highit + width)));
//        }catch (InputMismatchException e){
//            System.out.println("Invalid input ");
//        }catch (Exception e){
//            System.out.println("Height or Weight can not be nigitive");
//        }

        //-----------------------------------------------------------------------------------------------------------


        //Ex 11
//
//        try {
//            System.out.print("Input first integer: ");
//            int num1 = input.nextInt();
//            System.out.print("Input second integer: ");
//            int num2 = input.nextInt();
//            if (num1 != num2)
//                System.out.println(num1 + "!= " + num2);
//            if (num1 > num2)
//                System.out.println(num1 + " > " + num2);
//            if (num1 >= num2)
//                System.out.println(num1 + " >= " + num2);
//            if (num1 <= num2)
//                System.out.println(num1 + " <= " + num2);
//            if (num1 < num2)
//                System.out.println(num1 + " < " + num2);
//            if (num1 == num2)
//                System.out.println(num1 + " == " + num2);
//        }catch (InputMismatchException e){
//            System.out.println("Invalid input ");
//        }

        //-----------------------------------------------------------------------------------------------------------


        //Ex 12
//
//        try {
//            System.out.print("Input seconds :");
//            double sec = input.nextDouble();
//            if (sec < 0)
//                throw new Exception("");
//            System.out.println((int) sec / 3600 + ":" + ((int) (sec % 60)) + ":" + ((int) ((sec / 60) % 60)));
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input");
//        } catch (Exception e) {
//            System.out.println("seconds can not be nigitive");
//        }


        //-----------------------------------------------------------------------------------------------------------


        //Ex 13
//        try {
//            System.out.print("Input first number: ");
//            int num1 = input.nextInt();
//            System.out.print("Input second number: ");
//            int num2 = input.nextInt();
//            System.out.print("Input third number: ");
//            int num3 = input.nextInt();
//            System.out.print("Input fourth number: ");
//            int num4 = input.nextInt();
//            if (num1 == num2 &&
//                    num2 == num3 && num3 == num4)
//                System.out.println("Numbers are equal");
//            else
//                System.out.println("Numbers are not equal!");
//        }catch (InputMismatchException e){
//            System.out.println("Invalid input");
//        }


        //-----------------------------------------------------------------------------------------------------------


        //Ex 14

//        try {
//            System.out.print("Input a number:");
//            int num = input.nextInt();
//            if (num > 0)
//                System.out.println("number is positve");
//            else if (num < 0)
//                System.out.println("number is nigitive");
//            else
//                System.out.println("number is 0");
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input");
//        }


        //-----------------------------------------------------------------------------------------------------------


        //Ex 15

//
//        int num_P = 0, num_N = 0, num_Z = 0, num_Enterd = 0;
//        while (true) {
//
//            try {
//                num_Enterd = input.nextInt();
//            } catch (InputMismatchException e) {
//                System.out.println("Invalid input ");
//            }
//            if (num_Enterd == -1)
//                break;
//            if (num_Enterd > 0)
//                num_P++;
//            else if (num_Enterd < 0)
//                num_N++;
//            else
//                num_Z++;
//        }
//        System.out.println(num_P + " positives");
//        System.out.println(num_Z + " zero");
//        System.out.println(num_N + " negatives");


        //-----------------------------------------------------------------------------------------------------------
//


        //Ex 16
//
//        try {
//            System.out.println("Enter the num");
//            int num = input.nextInt();
//            String temp = "" + num;
//            StringBuilder sb = new StringBuilder(temp);
//            StringBuilder str = sb.reverse();
//            System.out.println("Reverse int :" + str);
//        }catch (InputMismatchException e){
//            System.out.println("invalid input");
//
//        }

        //-----------------------------------------------------------------------------------------------------------

        //Ex 17
//
//        try {
//            int num_Enterd = 0, max = 0, min = 0, count = 0, temp = 0;
//            System.out.println("Enter Count of num");
//            count = input.nextInt();
//            if(count<=0)
//                throw new Exception("");
//            for (int i = 1; i <= count; i++) {
//                System.out.print("enter the number :");
//                num_Enterd = input.nextInt();
//                if (num_Enterd != temp) {
//                    max = Math.max(temp, num_Enterd);
//                    min = Math.min(temp, num_Enterd);
//                }
//                temp = num_Enterd;
//
//            }
//            System.out.println("the large num " + max);
//            System.out.println("the small num " + min);
//        }catch (InputMismatchException e){
//            System.out.println("Invalid input");
//        }catch (Exception e){
//            System.out.println("Count can not be Zero or nigitive");
//        }


        //-----------------------------------------------------------------------------------------------------------

        //Ex 18

//        int count = 0;
//        try {
//            System.out.println("Enter phrase :");
//            String ph = input.nextLine();
//            numOfA(ph);
//        } catch (NullPointerException e) {
//            System.out.println("String can not be null");
//        }

    }


    //*************************************************************************************************************


    //                                            Methods Area


    //*************************************************************************************************************


    //-----------------------------------------------------------------------------------------------------------

    //Ex 1
//
//    static void mathOperations(int num1, int num2) throws ArithmeticException {
//        if (num2 == 0)
//            throw new ArithmeticException("Divide on zero undefined");
//        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
//        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
//        System.out.println(num1 + " mod " + num2 + " = " + (num1 / num2));
//    }


    //-----------------------------------------------------------------------------------------------------------

    //Ex 3
//
//    static void circleCalculations(double radius) throws Exception {
//        if (radius < 0)
//            throw new Exception("Radiud can not be mines");
//        double perimeter = Math.PI * radius * 2, area = Math.PI * Math.pow(radius, 2);
//        System.out.print("Radius = " + radius + "\nPerimeter is = " +
//                perimeter + "\nArea is = " + area);


    //-----------------------------------------------------------------------------------------------------------


    //Ex 18
//
//    static void numOfA(String ph) throws NullPointerException {
//        if (ph == null)
//            throw new NullPointerException();
//        int count = 0;
//        for (int i = 0; i < ph.length(); i++) {
//            if (ph.charAt(i) == 'a')
//                count++;
//        }
//        System.out.println("Num of a: " + count);
//
//    }


    //*************************************************************************************************************


    //                                            End of Exercise


    //*************************************************************************************************************


}




