package repl.its;

import java.util.Scanner;

public class B101_Arrays_Print_First_Last_Char1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),
                input.nextLine()};

        for(int i =0; i< words.length;i++) {

            words[i] = " "+ words[i].charAt(0)+words[i].charAt(words[i].length()-1);
            words[i] =words[i].trim();

            System.out.println(words[i]);

        }


    }

}
