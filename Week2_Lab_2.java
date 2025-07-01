import java.util.Scanner;

public class Week2_Lab_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);





//                                    **********************************************
//                                                  Lab 2 week 2
//                                    **********************************************


        // Ex 1

//        String[] words = {"cat", "dog", "red", "is", "am"};
//        for (int i = 0; i < words.length; i++)
//            if (words[i].length() >= 3)
//                System.out.print("\""+words[i]+"\"" + ", ");


        //---------------------------------------------------------------

        // Ex 2

//        int[] nums = {1, 1, 1, 3, 3, 5};
//        System.out.println("Enter num :");
//        int num = input.nextInt();
//        occurance(num,nums);

        //---------------------------------------------------------------------

        //Ex 3


//        System.out.println("Enter num of largest element you want :");
//        int k = input.nextInt();
//        int[] nums = {1, 4, 17, 7, 25, 3, 100};
//        largest_Knums(nums,k);


        //---------------------------------------------------------------------


        // Ex 4

//        int[] num = {5, 4, 3, 2, 1};
//        reverse(num);


        //---------------------------------------------------------------------


        // Ex 5

//
//        System.out.println("Enter the size of array :");
//        int[] num = new int[input.nextInt()];
//
//        int num_from_user = 0;
//
//        int count = 0;
//        do {
//            System.out.println("1. Accept elements of an array   \n" +
//                    "2. Display elements of an array   \n" +
//                    "3. Search the element within array   \n" +
//                    "4. Sort the array  5. To Stop the size of the array should be \n" +
//                    "entered by the user.  ");
//            num_from_user = input.nextInt();
//            if (num_from_user == 5) {
//                System.out.println("Thank u ");
//                break;
//            }
//            switch (num_from_user) {
//                case 1 -> {
//                    System.out.println("Enter num that you want to enter:");
//                    add(input.nextInt(), num, count);
//                    count++;
//                }
//                case 2 -> {
//                    display(num, count);
//                }
//                case 3 -> {
//                    System.out.println("Enter the element that you want to search :");
//                    int num_search = input.nextInt();
//                    if (search(num, count, num_search))
//                        System.out.println(num_search + " is exist.");
//                    else
//                        System.out.println(num_search + " is not exist");
//
//
//                }
//                case 4 -> {
//                    sort(num, count);
//                }
//
//                default -> System.out.println("Invalid input");
//            }
//        } while (true);



        //-------------------------------------------------------------------------------------------


        //Ex 6

//
//
//        System.out.println("Enter the minimum value of the range:");
//        int min=input.nextInt();
//        System.out.println("Enter the maximum value of the range:");
//        int max=input.nextInt();
//        System.out.println("Enter the number of random numbers to generate:");
//        int num_random=input.nextInt();
//        for (int i=0;i<num_random;i++)
//            System.out.print(randnum_specificrange(min,max)+" - ");

        //-------------------------------------------------------------------------------------------




        //Ex 7

//        System.out.println("Enter a password: ");
//        String pass = input.nextLine();
//        int sum = checkLength(pass) + checkSpecialCharacters(pass) + checkUpperCaseLowerCase(pass);
//        if (sum >= 8)
//            System.out.println("Password is strong");
//        else if (sum >= 5)
//            System.out.println("Password is moderately strong");
//        else
//            System.out.println("Password is weak");
//
//

        //-------------------------------------------------------------------------------------------



        //Ex 8
//
//
//        System.out.println("Enter num :");
//        int num=input.nextInt();
//        for (int i = 0; i < num; i++) {
//            System.out.print(fabinotch(i) + " ");
//        }




        //-------------------------------------------------------------------------------------------



    }



//                                    **********************************************
//                                                  Methods Area
//                                    **********************************************






    //------------------------------------------------------------------------------

    //Ex 2
//
//    static void occurance(int num,int[] nums){
//
//        int count = 0;
//        for (int i = 0; i < nums.length; i++)
//            if (num == nums[i])
//                count++;
//        if (count == 0)
//            System.out.println(num + " occurs " + count + " time");
//        else
//            System.out.println(num + " occurs " + count + " times");
//
//
//    }

    //------------------------------------------------------------------------------

    //Ex 3
//
//    static void largest_Knums(int nums[], int k) {
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = 0; j < nums.length - 1 - i; j++) {
//                if (nums[j] > nums[j + 1]) {
//                    int temp = nums[j];
//                    nums[j] = nums[j + 1];
//                    nums[j + 1] = temp;
//                }
//            }
//        }
//        for (int i = nums.length - 1; i >= nums.length - k; i--)
//            System.out.print(nums[i] + " ");
//
//    }


    //------------------------------------------------------------------------------



    //Ex 4
//
//    static void reverse(int[] num) {
//        int[] num1 = new int[num.length];
//        int count = 0;
//        for (int i = num.length - 1; i >= 0; i--)
//            num1[count++] = num[i];
//        for (int n : num1)
//            System.out.print(n + " ");
//    }



    //------------------------------------------------------------------------------



    // Ex 5
//
//    static void add(int num, int[] n, int c) {
//        n[c] = num;
//        System.out.println(num + " added successfuly and its index is " + c + "\nremaning cpacity is : " + (n.length - (c + 1)));
//
//
//    }
//
//    static void display(int[] n, int c) {
//        for (int i = 0; i < c; i++)
//            System.out.print(n[i] + " ,");
//        System.out.println();
//    }
//
//    static boolean search(int[] n, int c, int num) {
//        for (int i = 0; i < c; i++)
//            if (n[i] == num)
//                return true;
//        return false;
//    }
//
//    static void sort(int[] n, int c) {
//        for (int i = 0; i < c - 1; i++) {
//            for (int j = 0; j < c - 1 - i; j++) {
//                if (n[j] > n[j + 1]) {
//                    int temp = n[j];
//                    n[j] = n[j + 1];
//                    n[j + 1] = temp;
//                }
//            }
//        }
//        System.out.println("The array is sorted");
//
//    }



    //------------------------------------------------------------------------------




    //Ex 6
//
//
//    static int randnum_specificrange(int min, int max) {
//        return (int) (Math.random() * (max - min + 1)) + min;
//    }


    //------------------------------------------------------------------------------




    //Ex 7
//
//
//
//    static int checkLength(String pass) {
//        int point = 0, paas_len = pass.length();
//        if (paas_len >= 0 && paas_len <= 5)
//            point = 0;
//        else if (paas_len >= 6 && paas_len <= 7)
//            point = 2;
//        else
//            point = 3;
//        return point;
//
//
//    }
//
//    static int checkSpecialCharacters(String pass) {
//        String specialC = "!@#$%^&*()_+-=[]{}/\\|;:'\",.<>?";
//        int count_speacial = 0, point;
//        for (int i = 0; i < pass.length(); i++)
//            if (specialC.contains(String.valueOf(pass.charAt(i))))
//                count_speacial++;
//        if (count_speacial == 0)
//            point = 0;
//        else
//            point = 2;
//        return point;
//
//
//    }
//
//    static int checkUpperCaseLowerCase(String pass) {
//        int point = 0;
//        boolean hasUpper = false;
//        boolean hasLower = false;
//
//        for (int i = 0; i < pass.length(); i++) {
//            if (Character.isUpperCase(pass.charAt(i)))
//                hasUpper = true;
//            else if (Character.isLowerCase(pass.charAt(i)))
//                hasLower = true;
//        }
//
//        if (hasUpper && hasLower)
//            point = 3;
//        else
//            point = 0;
//        return point;
//
//
//    }
//



    //------------------------------------------------------------------------------



    //Ex 8

//
//    static int fabinotch(int num){
//        if(num<=1)
//            return num;
//        return fabinotch(num-1)+fabinotch(num-2);
//    }


    //------------------------------------------------------------------------------


//                                    **********************************************
//                                                  End of Lab 2
//                                    **********************************************






}

