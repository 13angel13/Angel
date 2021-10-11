/*
 *  Даны два действительных числа. Необходимо получить их сумму, разность и произведение. Результат вывести на консоль.
 */
package Lab_3;

/**
 *
 * @author Drozdova
 */
import java.util.Scanner;
public class Zadanie3 {
    public static void main (String args[]) {
        System.out.println("Введите два действительных числа:");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Сумма: "+(a+b));
        System.out.println("Разность: "+(a-b));
        System.out.println("Произведение: "+(a*b));
    }
}