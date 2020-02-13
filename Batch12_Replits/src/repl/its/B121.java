package repl.its;

import java.util.Arrays;
import java.util.Scanner;

public class B121 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String []str2=str.split(",");
        String small="                            ";
        String empty="";
        int num;

        for (int i=0;i<str2.length;i++) {
            str2[i]=str2[i].trim();
            if (small.length()>str2[i].length()) {
                small=str2[i];}
        }
        for (int k=0;k<str2.length;k++) {
            if (small.length()==str2[k].length())
                empty=empty.concat(str2[k]+" ");
        }

        String [] works=empty.split(" ");
        Arrays.sort(works);
        System.out.println(Arrays.toString(works));

    }
}
