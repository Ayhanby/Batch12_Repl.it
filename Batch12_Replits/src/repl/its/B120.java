package repl.its;

import java.util.Scanner;

public class B120 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};
        String shortestword = "";
        int min=999;
        for(int i=0; i<str.length; i++) {
            if(str[i].length()<min) {
                min=str[i].length();
                shortestword=str[i];

            }
        }
        System.out.println(shortestword);

    }
}
