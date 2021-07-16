import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

public class calculo {
    public static void main(String[] arg) {
        ope A;
        int a, b, c, numeroaleatorio;

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Ingrese los datos de la matriz ");

        System.out.println("Numero de Filas: ");
        a = teclado.nextInt();
        System.out.println("Numero de columna: ");
        b = teclado.nextInt();
        System.out.println();
        A = new ope(a, b);
        for (int i = 0; i < A.filas; i++) {
            for (int j = 0; j < A.columnas; j++) {
                numeroaleatorio = (int) Math.floor(Math.random() * (9 - 1 + 1) + 1);
                
                A.Llenar(numeroaleatorio, i, j);
            }
        }

        

    }

}
