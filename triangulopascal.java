public class triangulopascal {
    public static void main(String[] args) {

        int filasTriangulo = 5;//numero de filas
        int[] a = new int[1];//valor fila 1


        for (int i = 1; i <= filasTriangulo; i++) {//condicion para las demas filas
            int[] x = new int[i];
            
            for (int j = 0; j < i; j++) {//operacion de cada fila
                if (j == 0 || j == (i - 1)) {
                    x[j] = 1;
                } else {
                    x[j] = a[j] + a[j - 1];
                }
                System.out.print(x[j] + " ");//Imprimir Valores
            }
            a = x;
            System.out.println(" ");//imprimir en forma de trinagulo
        }
    }
}