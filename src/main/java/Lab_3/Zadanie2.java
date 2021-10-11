/*
 Составьте программу расчета факториала для произвольного числа n<10.
 */
package Lab_3;
import java.util.Scanner;
/**
 *
 * @author Drozdova
 */
public class Zadanie2 {
     public static void main(String[] args) {
double s;
s = 1;
int n;
         try (Scanner in = new Scanner(System.in)) {
             System.out.print("n = ");
             n = in.nextInt();
             System.out.println("Your number: " + n);
         }
if (n > 0 && n<=9) {
for (int i = 1; i < n+1; i++) {
s = s * i;
}
System.out.println("Факториал равен: " + s);
} else if (n == 0) {
n = 1;
System.out.println("Факториал равен: " + n);
}else{
System.out.println("Введите число больше нуля и меньше десяти");
}
}
}