package repl.its;

import java.util.Scanner;

public class B109 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
            arr[i] = input.nextLine();

        //leave above alone!  write your code below
        int j = 0;
        for(String words: arr) {
            System.out.println(words.substring(0,3));
        }
    }
}
