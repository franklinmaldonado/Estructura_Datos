import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class numeromayot {
   public static void main(String[] args) throws NumberFormatException, IOException {
            int a[][], fila, columna;
            //double peso;
            //int filaMayor, filaMenor, colMayor, colMenor;
            //int mayor, menor;
        
        
            BufferedReader br;
        
            br = new BufferedReader(new InputStreamReader(System.in));
        
            System.out.println("Ingrese el tamaño de la fila");
            fila=Integer.parseInt(br.readLine());
            
        
            System.out.println("Ingrese el tamaño de la columna");
            columna=Integer.parseInt(br.readLine());
            a= new int[fila][columna];



        
        System.out.println("Lectura de elementos de la matriz: ");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print("A[" + i + "][" + j + "]= ");
                a[i][j]=Integer.parseInt(br.readLine());

            }
        }

        //System.out.println("valores introducidos:");
        //for (int i = 0; i < a.length; i++) { 
        //    for (int j = 0; j < a[i].length; j++) {
        //        System.out.print(a[i][j] + " ");
        //    }
        //    System.out.println();
        //}
        System.out.println("Transpuesta:");
        for (int j = 0; j < a.length; j++) { 
            for (int i = 0; i < a[j].length; i++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        
}
}


