package repl.its;

import java.util.Scanner;

public class B102_ArraysReverseSentance {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TODO: Type your code below
        String[] reverse = sentence.split(" ");

        for (int i = reverse.length-1; i >= 0 ; i--) {
            System.out.println(reverse[i]);
        }

    }
}
