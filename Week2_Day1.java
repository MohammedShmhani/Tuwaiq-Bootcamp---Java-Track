import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Week2_Day_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Ex 1
//        int length = 0;
//        while (true) {
//            System.out.println("Enter the len of array:");
//            length = input.nextInt();
//            if (length >= 2)
//                break;
//            else
//                System.out.println("The length must be greater than or equal 2");
//
//        }
//
//        int[] nums = new int[length];
//        for (int i = 0; i < length; i++) {
//            System.out.println("Enter num " + (i + 1));
//            nums[i] = input.nextInt();
//        }
//        System.out.println(nums[0] == nums[length - 1]);
//

        //Ex 2

//        int length = 0;
//        while (true) {
//            System.out.println("Enter the len of array:");
//            length = input.nextInt();
//            if (length >= 2)
//                break;
//            else
//                System.out.println("The length must be greater than or equal 2");
//
//        }
//        double sum = 0;
//
//        int[] nums = new int[length];
//        for (int i = 0; i < length; i++) {
//            System.out.println("Enter num " + (i + 1));
//            nums[i] = input.nextInt();
//            sum += nums[i];
//        }
//
//        double avg = sum / length;
//        ArrayList<Integer> num_greaterthanavg = new ArrayList<>();
//        for (int num : nums) {
//            if (avg < num)
//                num_greaterthanavg.add(num);
//        }
//        int count = 0;
//        System.out.println("The average of the said array is: " + (sum / length) + " The numbers in the said array that are \n" +
//                "greater than the average are:");
//        for (int num : num_greaterthanavg) {
//            System.out.print(num_greaterthanavg.get(count) + " ");
//            count++;
//        }

        //Ex 3
//        Edited code
//        int[] nums = {20, 30, 40};
//        System.out.println("Larger value between first and last element: "+Math.max(nums[0],nums[nums.length-1]));

        //Ex 4

//        int[] num = {20, 30, 40};
//        int[] swap_num = new int[num.length];
//        swap_num[0] = num[num.length - 1];
//        swap_num[num.length - 1] = num[0];
//        int count = 1;
//        for (int numm : num) {
//            if (numm == num[num.length - 1] || numm == num[0])
//                continue;
//            swap_num[count] = num[count++];
//            if (count > num.length)
//                break;
//        }
//
//        System.out.print("New array after swapping the first and last elements: [");
//        for (int numm : swap_num)
//            System.out.print(numm + ",");
//        System.out.print("]");
//

        //Ex 5
//
//        int[] nums={2,3,40,1,5,9,4,10,7};
//        ArrayList<Integer> odd_even=new ArrayList<>();
//        for (int num:nums){
//            if(num%2!=0)
//                odd_even.add(num);
//        }
//        for (int num:nums){
//            if(num%2==0)
//                odd_even.add(num);
//        }
//        System.out.println(odd_even);

        //Ex 6
//
//        int[] num1={2,3,6,6,4},num2={2,3,6,6,4};
//        System.out.println(Arrays.equals(num1,num2));



    }
}
