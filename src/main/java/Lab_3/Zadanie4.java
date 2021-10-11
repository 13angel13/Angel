/*
 * Определить время свободного падения материального тела с заданной высоты h. Результат вывести в консоль.
 */
package lab_3;

/**
 *
 * @author Drozdova
 */
import java.util.Scanner;
public class Zadanie4 {
    public static void main (String args[]) {
        System.out.println("Введите высоту:");
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();
        if (h >=0) {
        System.out.println("Время падения = " + Math.sqrt((2 * h) / 9.8));
        }
        else {
        System.out.println("Высота не может быть отрицательной. Введите положительное значение.");}
    }  
}