import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ordennum {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int op;
        int a[][], fila, columna;
     
        Scanner teclado = new Scanner(System.in);

        System.out.println("---MENU---");
        System.out.println("1.-ORDENAMIENTO DATOS QUITSHORT");
        System.out.println("2.INGRESO MATRIZ");
        op = teclado.nextInt();
       

            switch (op) {

                case 1:

                    System.out.print("Ingrese la dimension del arreglo: ");
                    int tam = teclado.nextInt();
                    int arreglo[] = new int[tam];

                    // Ingresando valores al arreglo
                    for (int i = 0; i < arreglo.length; i++) {
                        System.out.print("A[" + i + "]= ");
                        arreglo[i] = teclado.nextInt();
                    }

                    quicksort(arreglo, 0, tam - 1);

                    System.out.println("El arreglo oredenado en Quick Sort es: ");
                    for (int i = 0; i < arreglo.length; i++) {
                        System.out.print("\t" + arreglo[i]);
                    }
                    break;


                case 2:

                
                    BufferedReader br;

                    br = new BufferedReader(new InputStreamReader(System.in));

                    System.out.println("Ingrese el tamaño de la fila");
                    fila = Integer.parseInt(br.readLine());

                    System.out.println("Ingrese el tamaño de la columna");
                    columna = Integer.parseInt(br.readLine());
                    a = new int[fila][columna];

                    System.out.println("Ingrese los datos faltantes en la matriz: ");
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
            }
        
        

    }

    static void quicksort(int arreglo[], int primero, int ultimo) {
        int central, i, j;
        int pivote;
        central = (primero + ultimo) / 2;
        pivote = arreglo[central];
        i = primero;
        j = ultimo;
        do {
            while (arreglo[i] < pivote)
                i++;
            while (arreglo[j] > pivote)
                j--;
            if (i <= j) {
                int temp;
                temp = arreglo[i];
                arreglo[i] = arreglo[j]; /* intercambia A[i] con A[j] */
                arreglo[j] = temp;
                i++;
                j--;
            }
        }

        while (i <= j);
        if (primero < j)
            quicksort(arreglo, primero, j);
        if (i < ultimo)
            quicksort(arreglo, i, ultimo);
    }

}
