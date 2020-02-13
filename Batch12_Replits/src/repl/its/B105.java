package repl.its;

import java.util.Arrays;
import java.util.Scanner;

public class B105 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below
        String word="";
        for(int i=0; i<=words.length-1; i++) {
            if(words[i].length() == 2) {
                word +=" "+ words[i];
            }else if(words[i].length() >=3) {
                word +=" "+words[i].charAt(0)+words[i].charAt(words[i].length()-1);
            }
        }word = word.trim();
        String [] word2=word.split(" ");
        System.out.println(Arrays.toString(word2));




    }
}
