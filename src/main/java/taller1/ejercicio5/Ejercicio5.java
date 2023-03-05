/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package taller1.ejercicio5;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        double suma = 0, x, y;
        
        Scanner N = new Scanner(System.in);
        
        System.out.println("Ingrese el valor X: ");
        x = N.nextDouble();
        
        System.out.println("Ingrese el valor de Y: ");
        y = N.nextDouble();
        
        x = x * Math.pow(y, 2);
        
        suma = suma + (x/y);
        System.out.println("El valor de la suma es: " + suma);
        
    }
}
