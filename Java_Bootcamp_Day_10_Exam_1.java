import java.util.Scanner;

public class Java_Bootcamp_Day_10_Exam_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //************************************************************************************************************


        //                                                 Java_Bootcamp_Day_10_Exam_1


        //************************************************************************************************************


        //------------------------------------------------------------------------------------------------------------

        //Q 1

//        System.out.println("Enter num 1");
//        int n1 = input.nextInt();
//        System.out.println("Enter num 2");
//        int n2 = input.nextInt();
//        System.out.println("Enter num 3");
//        int n3 = input.nextInt();
//        System.out.println("The largest num is : " +
//                largesAmongThree(n1, n2, n3));

        //------------------------------------------------------------------------------------------------------------


        //Q 2

//        System.out.println("Enter a phrse :");
//        String ph = input.nextLine();
//        System.out.println("Enter a index :");
//        int index = input.nextInt();
//        System.out.println("The char in given index is: " + charIngivenIndex(ph,index));


        //------------------------------------------------------------------------------------------------------------


        //Q 3

//        sumOfNums();


        //------------------------------------------------------------------------------------------------------------


        //Q 4

//
//        int[] nums = {10, -21, 30, 31, -25};
//        checkPositiveOrNigitveInArray(nums);


        //------------------------------------------------------------------------------------------------------------

        //Q 5

//
//        String[] arr = {"Tuwaiq", "Bootcamp", "Student", "JAVA"};
//        shotestWordInArray(arr);


        //------------------------------------------------------------------------------------------------------------


    }


    //************************************************************************************************************


    //                                                 Methods_Area


    //************************************************************************************************************


//------------------------------------------------------------------------------------------------------------

    //Q 1
//
//    static int largesAmongThree(int n1, int n2, int n3) {
//        return Math.max(Math.max(n1, n2), n3);
//    }

    //------------------------------------------------------------------------------------------------------------


    //Q 2

//    static char charIngivenIndex(String ph, int index) {
//        return ph.charAt(index);
//    }

    //------------------------------------------------------------------------------------------------------------


    //Q 3
//
//    static void sumOfNums() {
//        Scanner input = new Scanner(System.in);
//        int sum = 0, num = 0, count = 0, stop = 0;
//        while (true) {
//            System.out.println("Enter num " + (++count));
//            num = input.nextInt();
//            sum += num;
//            System.out.println("If you want to stop enter 0 \nto continue enter any num");
//            stop = input.nextInt();
//            if (stop == 0)
//                break;
//        }
//        System.out.println("The summation of " + count + " nums is : " + sum);
//
//    }

    //------------------------------------------------------------------------------------------------------------


    //Q4

//    static void checkPositiveOrNigitveInArray(int[] nums) {
//        for (int num : nums)
//            if (num > 0)
//                System.out.println(num + " is a positive number ");
//            else if (num < 0)
//                System.out.println(num + " is a negative number");
//            else
//                System.out.println(num + " is a zero ");
//    }

    //------------------------------------------------------------------------------------------------------------

    //Q 5

//
//    static void shotestWordInArray(String[] arr) {
//        int min = arr[0].length(), index = 0;
//        for (int i = 0; i < arr.length; i++)
//            if (min != arr[i].length()) {
//                min = Math.min(arr[i].length(), min);
//                index = i;
//            }
//        System.out.println(arr[index]);
//    }

    //------------------------------------------------------------------------------------------------------------





    //************************************************************************************************************


    //                                                 End_Of_Exam


    //************************************************************************************************************



}



