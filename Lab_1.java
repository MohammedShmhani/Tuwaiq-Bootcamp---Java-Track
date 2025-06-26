import java.util.Scanner;
import java.lang.Math;

public class Lab_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //Ex 1
//        System.out.print("Input first number: ");
//        int num1=i.nextInt();
//        System.out.print("Input second number: ");
//        int num2=i.nextInt();
//        System.out.println(num1+" + "+num2+" = "+(num1+num2));
//        System.out.println(num1+" - "+num2+" = "+(num1-num2));
//        System.out.println(num1+" x "+num2+" = "+(num1*num2));
//        System.out.println(num1+" mod "+num2+" = "+(num1/num2));

        //Ex2

//        System.out.print("Input a number:");
//        int num1 = i.nextInt();
//        for (int i1 = 1; i1 <= 10; i1++) {
//            System.out.println(num1 + " * " + i1 + " = " + (num1 * i1));
//        }

        //Ex3
//        System.out.print("Enter the Radios of circule :");
//        double radius = i.nextDouble(), perimeter = Math.PI * radius * 2, area = Math.PI * Math.pow(radius, 2);
//        System.out.print("Radius = " + radius + "\nPerimeter is = " +
//                perimeter + "\nArea is = " + area);

        //Ex4
//        System.out.println("Enter the count of numbers:");
//        int count = in.nextInt(), num = 0;
//        double sum = 0;
//        double avg;
//        for (int i = 1; i <= count; i++) {
//            System.out.println("Enter an integer: ");
//            num = in.nextInt();
//            sum += num;
//
//        }
//        System.out.println("The average is: " + (sum / count));

        //Ex5
//        System.out.print("Input the first number : ");
//        int num1 = in.nextInt();
//        System.out.print("Input the second number : ");
//        int num2 = in.nextInt();
//        System.out.print("Input the third number : ");
//        int num3 = in.nextInt();
//        boolean b = false;
//        if ((num1 + num2) == num3) {
//            b = true;
//            System.out.print("The result is: " + b);
//        } else {
//            b = false;
//            System.out.print("The result is: " + b);
//
//        }
//        System.out.println();
//        System.out.print("----------------------------");

        //Ex 6
//        System.out.print("Input a word: ");
//        String word = in.nextLine();
//        StringBuilder res = new StringBuilder();
//        res.append(word);
//        System.out.print("Reverse word: " + res.reverse());

        //Ex 7
//        System.out.println("Enter a number: ");
//        int num=in.nextInt();
//        if(num%2==0)
//            System.out.println("The number is Even");
//        else
//            System.out.println("The number is Odd ");

        //Ex 8
//        System.out.println("Enter  temperature in Centigrade: ");
//        double temp=in.nextDouble();
//        System.out.println("Temperature in Fahrenheit is: "+((temp*1.8)+32));

        //Ex 9

//        System.out.print("Input a string: ");
//        String s=in.nextLine();
//        System.out.print("Input a number: ");
//        int num=in.nextInt();
//        System.out.println(s.charAt(num));

        //Ex 10
//        System.out.println("Width =" );
//        double width=in.nextDouble();
//        System.out.println("Height =" );
//        double highit=in.nextDouble();
//        System.out.println("Area is "+width+" * "+highit+" = "+(width*highit)+
//         "\nPerimeter is 2 * ("+width+" + "+highit+" ) = "+(2*(highit+width)) );

        //Ex 11
//        System.out.print("Input first integer: ");
//        int num1=in.nextInt();
//        System.out.print("Input second integer: ");
//        int num2=in.nextInt();
//
//        if(num1!=num2)
//            System.out.println(num1 +"!= "+num2);
//        if (num1>num2)
//            System.out.println(num1 +" > "+num2);
//        if (num1>=num2)
//            System.out.println(num1 +" >= "+num2);
//        if (num1<=num2)
//            System.out.println(num1 +" <= "+num2);
//        if (num1<num2)
//            System.out.println(num1 +" < "+num2);
//
//        if (num1==num2)
//            System.out.println(num1 +" == "+num2);

        //Ex 12

//        System.out.print("Input seconds :");
//        double sec = in.nextDouble();
//        System.out.println((int) sec / 3600 + ":" + ((int) (sec % 60)) + ":" + ((int) ((sec / 60) % 60)));

        //Ex 13
//        System.out.print("Input first number: ");
//        int num1 = in.nextInt();
//        System.out.print("Input second number: ");
//        int num2 = in.nextInt();
//        System.out.print("Input third number: ");
//        int num3 = in.nextInt();
//        System.out.print("Input fourth number: ");
//        int num4 = in.nextInt();
//        if(num1==num2 &&
//        num2==num3&&num3==num4)
//            System.out.println("Numbers are equal");
//        else
//            System.out.println("Numbers are not equal!");

        //Ex 14
//        System.out.print("Input a number:");
//        int num = in.nextInt();
//        if (num > 0)
//            System.out.println("number is positve");
//        else if (num < 0)
//            System.out.println("number is nigitive");
//        else
//            System.out.println("number is 0");

        //Ex 15
//        int num_P = 0, num_N = 0, num_Z = 0, num_Enterd = 0;
//        while (true) {
//            num_Enterd = in.nextInt();
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

        //Ex 16

//        System.out.println("Enter the num");
//        int num=in.nextInt();
//        String temp = "" + num;
//        StringBuilder sb = new StringBuilder(temp);
//        StringBuilder str = sb.reverse();
//        System.out.println("Reverse int :"+str);

        //Ex 17
//        int num_Enterd = 0, max = 0, min = 0, count = 0, temp = 0;
//        System.out.println("Enter Count of num");
//        count = in.nextInt();
//        for (int i = 1; i <= count; i++) {
//            System.out.print("enter the number :");
//            num_Enterd = in.nextInt();
//            if (num_Enterd != temp) {
//                max = Math.max(temp, num_Enterd);
//                min = Math.min(temp, num_Enterd);
//            }
//            temp = num_Enterd;
//
//        }
//        System.out.println("the large num " + max);
//        System.out.println("the small num " + min);


        //Ex 18

//        int count = 0;
//        System.out.println("Enter phrase :");
//        String ph = in.nextLine();
//        for (int i = 0; i < ph.length(); i++) {
//            if (ph.charAt(i) == 'a')
//                count++;
//        }
//        System.out.println("Num of a: " + count);


    }


}

