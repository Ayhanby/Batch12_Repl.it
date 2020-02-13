package repl.its;

import java.util.Scanner;

public class B108_2 {
    public static void main(String[] args) {

        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        for( int i = 1; i <=n; i++) {

            for(j=0; j< i ; j++) {

                System.out.print("*");

            }
            System.out.println();
        }


    }
}
