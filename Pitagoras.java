import java.io.*;
import java.util.*;

public class Pitagoras{
    public static void main(String[]args){
        double a = 0;
        int b = 0;
        int c = 0;

        Scanner teclado = new Scanner(System.in);

        b = teclado.nextInt();
        c = teclado.nextInt();

        a = (b*b)+(c*c);

        a = Math.sqrt(a);;

        System.out.println("a = " + a);

    }
}