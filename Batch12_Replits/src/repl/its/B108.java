package repl.its;

import java.util.Scanner;

public class B108 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below

        String[] splitted = email.split("@");

        if(splitted.length==2 ){
            System.err.println("Email id: "+splitted[0]);
            System.out.println("Email domain: "+splitted[1]);
        }else{
            System.out.println("invalid email");
        }
    }
}
