import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class matriz {
  public static void main(String[] args) throws NumberFormatException, IOException {
    int a[][], fila, columna;
    double peso;
    int filaMayor, filaMenor, colMayor, colMenor;
    int mayor, menor;

    BufferedReader br;

    br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Ingrese el tamaño de la fila");
    fila = Integer.parseInt(br.readLine());

    System.out.println("Ingrese el tamaño de la columna");
    columna = Integer.parseInt(br.readLine());
    a = new int[fila][columna];

    System.out.println("Ingrese los Datos de la Matriz: ");
    for (int i = 0; i < fila; i++) {
      for (int j = 0; j < columna; j++) {
        System.out.print("A[" + i + "][" + j + "]= ");
        a[i][j] = Integer.parseInt(br.readLine());
      }
    }
    System.out.println("Matriz Ingresada:");
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
    // Numero mayor numero menor
    mayor = menor = a[0][0];
    filaMayor = filaMenor = colMayor = colMenor = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (a[i][j] > mayor) {
          mayor = a[i][j];
          filaMayor = i;
          colMayor = j;
        } else if (a[i][j] < menor) {
          menor = a[i][j];
          filaMenor = i;
          colMenor = j;
        }
      }
    }
    System.out.print("Elemento mayor: " + mayor);
    System.out.println(" Fila: " + filaMayor + " Columna: " + colMayor);
    System.out.print("Elemento menor: " + menor);
    System.out.println(" Fila: " + filaMenor + " Columna: " + colMenor);

   
}
}
