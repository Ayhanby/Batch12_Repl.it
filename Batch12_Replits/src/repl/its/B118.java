package repl.its;

import java.util.Arrays;
import java.util.Scanner;

public class B118 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        //TODO: write your code below
        int middle=nums.length/2;
        for (int i = 0 , j=nums.length-1; i <middle ; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        //Do not change below statement:
        System.out.println(Arrays.toString(nums));
    }
}
