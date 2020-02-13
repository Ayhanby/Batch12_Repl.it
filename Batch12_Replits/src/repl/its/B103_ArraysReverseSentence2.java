package repl.its;

import java.util.Scanner;

public class B103_ArraysReverseSentence2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here
        String [] arr = sentence.split(" ");//convert to an array
        for(int i=arr.length-1; i>=0; i-- ){//reverseing by index
            reversed += arr[i]+" ";//assigning to a String

        }reversed=reversed.trim();


        //End your code here. do not modify below statement
        System.out.println(reversed);

    }
}
