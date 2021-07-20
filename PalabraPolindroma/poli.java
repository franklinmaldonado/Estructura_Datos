package PalabraPolindroma;

import java.util.Scanner;

public class poli {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int pos = 0;
        StringBuffer frase, inversa;
        String F1, F2;
        String continuar;

        System.out.println("Introduzca la palabra a verificar");
        frase = new StringBuffer(entrada.nextLine());

        while (pos < frase.length())
            if (!Character.isLetter(frase.charAt(pos)))
                frase.deleteCharAt(pos);
            else
                pos++;
        inversa = new StringBuffer(frase);
        inversa.reverse();
        F1 = frase.toString();
        F2 = inversa.toString();
        if (F1.equalsIgnoreCase(F2))
            System.out.println("La palabra ingresada es un palíndromo.");
        else
            System.out.println("La palabra ingresada no es un palíndromo.");

        


    }

}
