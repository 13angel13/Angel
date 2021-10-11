/*
 С помощью цикла вычислите значение выражения 2^n.
 */
package Lab_3;
import java.util.Scanner;
/**
 *
 * @author Drozdova
 */
public class Zadanie1_1 {
     public static void main(String[] args) {
     int n;
     try (Scanner in = new Scanner(System.in)) {
         System.out.print("n = ");
         n = in.nextInt();
         System.out.println("Your number: " + n);
         }
     double s;
     s = 1;
     if (n >= 0) {
         for (int i = 0; i < n; i++) {
         s = s * 2;
         }
     } else {
     n = -n;
     for (int i = 0; i < n; i++) {
         s = s * 2;
         }
     s = 1 / s;}
System.out.println("n^2 = " + s);
}
}
