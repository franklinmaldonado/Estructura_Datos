package Proyecto;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        // Ingrese dos números grandes de tipo de cadena
        metodos li = new metodos();

        System.out.println("Ingrese el primer entero");
        String num1 = datos.nextLine();
        System.out.println("Ingrese el segundo entero");
        String num2 = datos.nextLine();
        String result = li.add(num1, num2);
        System.out.println("El Resultado de la suma de enteros es:  ");
        System.out.println(result);
    }
    
    

}
