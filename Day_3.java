import java.util.Scanner;

public class Day_3 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        //
        //Ex 1
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0)
//                System.out.println("Num :" + i + " FizzBuzz");
//            else if (i % 5 == 0)
//                System.out.println("Num :" + i + " Buzz");
//            else if (i % 3 == 0)
//                System.out.println("Num :" + i + " Fizz");
//            else
//                System.out.println("Num :" + i);
//
//
//        }
        //Ex2
//        System.out.println("Enetr a phrase of script");
//        String s1 = i.nextLine(), s2 = "";
//        for (int i1 = s1.length() - 1; i1 >= 0; i1--) {
//            s2 += s1.charAt(i1);
//        }
//        System.out.println("Reverse :" + s2);

        //Ex3

//        System.out.println("Enetr num:");
//        int num = i.nextInt(), factorial = 1, i1 = 1;
//        for (; i1 <= num; i1++) {
//
//
//            factorial *= i1;
//
//        }
//
//        System.out.println("Factorial of " + (i1 - 1) + " is : " + factorial);
        //Ex4

//        System.out.println("Enter 1st num :");
//        int num1=i.nextInt(),pow=1;
//        System.out.println("Enter 2nd num :");
//        int num2=i.nextInt();
//        for(int i1 = 1; i1 <=num2;i1++)
//            pow*=num1;
//        if(num2==0)
//            pow=1;
//        System.out.println(num1+" power of "+num2+" = "+pow);

        //Ex5
//        int sum=0,num=0,exite=0;
//        while (true){
//            System.out.println("Enter num :");
//            num=i.nextInt();
//            sum+=num;
//            System.out.println("To exit enter 0 to continue enter any num");
//            exite=i.nextInt();
//            if(exite==0)
//                break;
//        }
//        System.out.println("Summation of enterd numbers : "+sum);

        //Ex6

//        System.out.print("Enter a positive number: ");
//        int num = i.nextInt();
//        boolean isPrime = true;
//        if (num == 1) {
//            isPrime = false;
//        } else {
//            for (int i1 = 2; i1 < num; i1++) {
//                if (num % i1 == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//        if (isPrime) {
//            System.out.println(num + " is Prime");
//        } else {
//            System.out.println(num + " is Not Prime");
//        }
        //Ex 7

//        for (int i1 = 1; i1 <= 4; i1++) {
//            System.out.println("<Week " + i1 + " >");
//            for (int i2 = 1; i2 <= 7; i2++) {
//
//                System.out.println("| Day " + i2 + "|");
//
//
//            }
        //Ex 8
//        System.out.println("Enter word: ");
//        String word = i.nextLine(), reverse = "";
//        for (int i1 = word.length() - 1; i1 >= 0; i1--) {
//            reverse += word.charAt(i1);
//        }
//        if (reverse.equals(word))
//            System.out.println(word + " is palinrome");
//        else
//            System.out.println(word + " is not palinrome");


    }
}