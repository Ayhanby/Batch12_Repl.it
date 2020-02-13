package repl.its;

import java.util.Scanner;

public class B114 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int count =0;

        for(int each1: nums) {
            count = 0;
            for(int each2: nums) {

                if(each1  == each2) {
                    count++;
                }

            }
            if(count ==1) {
                System.out.println(each1);
            }
        }



    }
}
