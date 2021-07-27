package Proyecto;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        // Ingrese dos números grandes de tipo de cadena
        metodos li = new metodos();

        System.out.println("Ingrese el primer entero");
        String num1 = dato.nextLine();
        System.out.println("Ingrese el segundo entero");
        String num2 = dato.nextLine();
        String result = li.add(num1, num2));
        System.out.println("El Resultado de la suma de enteros es:  ");
        System.out.println(result);
    }
    
    //private static String add(String s1, String s2) {
        // Asegúrese de que s1 sea menor o igual que la longitud de s2, por lo que es
        // conveniente agregar 0 después
      //  if (s1.length() > s2.length()) {
          //  String temp = s1;
        //    s1 = s2;
            //s2 = temp;
        //}
        //int cha = s2.length() - s1.length();
        //for (int i = 0; i < cha; i++) {
        //    s1 = '0' + s1; // Agrega 0 al frente de la longitud más pequeña para que los dos números tengan
                           // la misma longitud
        //}
        //String result = "";
        //int w = 0; // Definir una variable para almacenar carry
        // De atrás hacia adelante, agregue poco a poco
        //for (int i = s2.length() - 1; i >= 0; i--) {
            // Los caracteres extraídos de s1 y s2 son caracteres, todos menos 48 es el
            // número de tipo int, más el acarreo es el resultado del bit actual
        //    int c = s2.charAt(i) + s1.charAt(i) - 96 + w;
        //    w = c / 10; // La suma máxima de dos números de tipo int de un dígito es más de diez, todo
                        // dividido por 10 es un acarreo
        //    result = (c % 10) + result;
        //}
        // Debido a que el ciclo anterior no juzga el acarreo cuando se agrega al primer
        // lugar, así que juzgalo al final
        //if (w == 1)
        //    result = 1 + result;
        ///return result;
    //}

}
