package Proyecto;

public class metodos {
     static String add(String num1, String num2) {
        // Asegúrese de que s1 sea menor o igual que la longitud de s2, por lo que es
        // conveniente agregar 0 después
        if (num1.length() > num2.length()) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }
        int cha = num2.length() - num1.length();
        for (int i = 0; i < cha; i++) {
            num1 = '0' + num1; // Agrega 0 al frente de la longitud más pequeña para que los dos números tengan
                           // la misma longitud
        }
        String result = "";
        int w = 0; // Definir una variable para almacenar carry
        // De atrás hacia adelante, agregue poco a poco
        for (int i = num2.length() - 1; i >= 0; i--) {
            // Los caracteres extraídos de s1 y s2 son caracteres, todos menos 48 es el
            // número de tipo int, más el acarreo es el resultado del bit actual
            int c = num2.charAt(i) + num1.charAt(i) - 96 + w;
            w = c / 10; // La suma máxima de dos números de tipo int de un dígito es más de diez, todo
                        // dividido por 10 es un acarreo
            result = (c % 10) + result;
        }
        // Debido a que el ciclo anterior no juzga el acarreo cuando se agrega al primer
        // lugar, así que juzgalo al final
        if (w == 1)
            result = 1 + result;
        return result;
    }
}
