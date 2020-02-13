package repl.its;

import java.util.Scanner;

public class B106 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below
        String[] arr= sentence.split(" ");
        for(int i=0; i<=arr.length-1; i++){
            System.out.println(arr[i]);
        }

    }
}
