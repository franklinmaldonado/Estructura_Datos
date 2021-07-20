
public class ope {

  public int Mat[][];
  public int filas, columnas;

  public ope() {

  }

  public ope(int f, int c) {
    filas = f;
    columnas = c;
    Mat = new int[filas][columnas];
  }

  public void Llenar(int valor, int i, int j) {
    Mat[i][j] = valor;

  }

  public void Mostrar() { // Muestra los elementos de la matriz.
    System.out.println("Matriz:");
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        System.out.print(Mat[i][j] + " ");
      }
      System.out.println();
    }
    // Numero mayor numero menor
    int filaMayor, filaMenor, colMayor, colMenor;
    int mayor, menor, d, b, c, numeroaleatorio;
    int a[][], fila, columna;
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
