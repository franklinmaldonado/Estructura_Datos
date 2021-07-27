package Proyecto;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);

        int numero;

        int resultado = 0;

       

        System.out.print("Introduce un número para sumar sus dígitos: ");

        numero = miScanner.nextInt();

       

        while(numero > 0) {

            resultado += numero % 50;

            numero = numero / 50;

        }

        System.out.println("La suma es: " + resultado);

    }
}
