import java.util.Scanner;

public class mayormenor {
   
        
    public static void main(String[] args) {

        int tamanio;
        int lista;
        int ordena;
        int ArrayN[] = null;
        int op;

        Scanner sc = new Scanner(System.in);

        System.out.println("INGRESE EL TANAÑO DEL ARRAY");
        tamanio = sc.nextInt();

        int num[] = new int[tamanio];

        rellenarArray(num);
        mostrarN(num);

        System.out.println("COMO DESEA ORDENAR LOS NUMERO");
        System.out.println("1. ASENDENTE");
        System.out.println("2. DESENDENTE");
        op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("ACENDENTE");
                ordAsendente(num);
                for (int i : num) {
                    System.out.println(i);
                }
                break;
            case 2:
                System.out.println("DESENDENTE");
                ordDescendente(num);
                for (int i : num) {
                    System.out.println(i);
                }
                break;

            default:
                System.out.println("ESA OPCION NO EXISTE");
                break;
        }

    }

    private static void rellenarArray(int lista[]) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < lista.length; i++) {
            System.out.println("INGRESE UN NUMERO");
            lista[i] = sc.nextInt();
        }
    }

    static void ordenaBurbuja(int ArrayN[]) {

        for (int i = 0; 1 < ArrayN.length - 1; i++) {
            for (int j = 0; j < ArrayN.length - 1; j++) {
                int temp = ArrayN[j + 1];

                ArrayN[j + 1] = ArrayN[j];
                ArrayN[j] = temp;
            }
        }

    }

    static void mostrarN(int ArrayN[]) {
        System.out.println("--------------------------------");
        for (int i = 0; i < ArrayN.length; i++) {
            System.out.println("LA POSISION " + (i + 1) + " TIENE EL VALOR " + ArrayN[i]);
        }
        System.out.println("--------------------------------");
    }

    static void ordAsendente(int[] arreglo) {

        for (int i = 0; i < arreglo.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }

            if (i != min) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = aux;
            }
        }
    }

    static void ordDescendente(int[] arreglo) {

        for (int i = 0; i < arreglo.length - 1; i++) {
            int max = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] > arreglo[max]) {
                    max = j;
                }
            }

            if (i != max) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[max];
                arreglo[max] = aux;
            }
        }
    }

}


